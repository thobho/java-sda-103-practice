package library;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebCrawler {

  public static void main(String[] args) throws IOException {
    Document doc = Jsoup.connect("https://en.wikipedia.org/").get();

    System.out.println(doc.body());

  }

}
