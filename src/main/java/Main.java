import model.MovieModel;
import request.IMDBParser;
import request.MovieRequest;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by mzaferanloo on 11/18/2016.
 */
public class Main {

    //if something goes wrong, we might see a TwitterException
    public static void main(String... args) throws TwitterException, IOException {

        Twitter twitter = TwitterFactory.getSingleton();

        while (true) {
            MovieModel movieModel = null;
            String image_url = null;
            ArrayList<String> arrayList = IMDBParser.parseLatestMovies();
            for (String anArrayList : arrayList) {
                if (!CheckMovie.checkHas(anArrayList)) {
                    String code = MovieRequest.getMovieFromExternal(anArrayList);
                    movieModel = MovieRequest.getMovie(code);
                    assert movieModel != null;
                    if (movieModel.getPoster_path() != null) {
                        image_url = MovieRequest.getPoster(movieModel.getPoster_path());
                    }
                    CheckMovie.addToFile(anArrayList);
                    break;
                }
            }

            if (movieModel != null && image_url != null) {
                System.out.println(image_url);
                InputStream input = new URL(image_url).openStream();
                String statusMessage = movieModel.getOriginal_title() + " (" + movieModel.getRelease_date().substring(0, 4) + ")"
                        + "\n";
                for (int a = 0; a < movieModel.getGenres().length; a++) {
                    statusMessage += "#" + movieModel.getGenres()[a].getName().replaceAll(" ", "_") + " ";
                }
                StatusUpdate statusUpdate = new StatusUpdate(statusMessage);
                statusUpdate.setMedia(movieModel.getOriginal_title(), input);
                twitter.updateStatus(statusUpdate);
            }
            System.out.println("done");
            try {
                Thread.sleep(2 * 60 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}