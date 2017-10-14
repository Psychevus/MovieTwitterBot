package request;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by mzaferanloo on 12/3/2016.
 */
public class IMDBParser {

    private static String BASE_URL_IMDB = "http://www.imdb.com/movies-in-theaters/";
    private static String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";


    public static ArrayList<String> parseLatestMovies() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String id;
        try {
            String url = BASE_URL_IMDB;
            Document doc = null;
            doc = Jsoup.connect(url).userAgent(USER_AGENT).timeout(100000).get();
            Elements name = doc.select("h4[itemprop=name]");
            for (Element p : name) {
                id = p.select("a").first().absUrl("href").replaceAll("http://www.imdb.com/title/", "").replaceAll("/\\?ref_=inth_ov_tt", "");
                arrayList.add(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
