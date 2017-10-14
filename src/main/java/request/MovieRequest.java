package request;

import com.fasterxml.jackson.databind.ObjectMapper;
import config.ConfigBot;
import model.MovieModel;
import model.ResultExternalModel;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mzaferanloo on 12/3/2016.
 */
public class MovieRequest {

    private static String BASE_URL_MOVIE = "https://api.themoviedb.org/3/movie/";
    private static String BASE_URL_IMAGE = "https://image.tmdb.org/t/p/w1000/";
    private static String BASE_URL_EXTERNAL = "https://api.themoviedb.org/3/find/";


    public static MovieModel getMovie(String number) {
        try {
            MovieModel movieModel;

            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(BASE_URL_MOVIE + number + ConfigBot.API_KEY + "&language=en-US");

            HttpResponse response = client.execute(request);
            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));
            StringBuilder result = new StringBuilder();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            ObjectMapper mapper = new ObjectMapper();
            movieModel = mapper.readValue(String.valueOf(result), MovieModel.class);

            return movieModel;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMovieFromExternal(String number) {
        try {
            ResultExternalModel resultExternalModel;

            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(BASE_URL_EXTERNAL + number + ConfigBot.API_KEY + "&language=en-US&external_source=imdb_id");

            HttpResponse response = client.execute(request);
            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));
            StringBuilder result = new StringBuilder();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            ObjectMapper mapper = new ObjectMapper();
            resultExternalModel = mapper.readValue(String.valueOf(result), ResultExternalModel.class);
            return resultExternalModel.getMovie_results()[0].getId();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String getPoster(String code) {
        return BASE_URL_IMAGE + code;
    }
}