import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class crawling {

	public static void main(String[] args) {
		
		String URL = "https://github.com/LEETAESEUNG/Subway-project/blob/master/%EC%A7%80%ED%95%98%EC%B2%A0%EB%85%B8%EC%84%A0(1).txt";
		try {
			Document document = Jsoup.connect(URL).get();
			
			Elements imageUrlElements = document.getElementsByClass("Box-body p-0 blob-wrapper data type-text  gist-border-0");
			Elements subElements = document.select("td");
			
			for (int i = 0; i < subElements.size(); i++) {
                String sub = subElements.get(j).text();
                System.out.println(sub);
            }
		}catch (IOException e) {
            e.printStackTrace();
        }
	}

}
