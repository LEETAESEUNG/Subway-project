import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class crawling {

	public static void main(String[] args) {
		
		String URL = "https://github.com/IMjaeyongpark/2022/blob/main/2-2/Basic%20Project2/project/data";
		try {
			Document document = Jsoup.connect(URL).get();
			
			Elements imageUrlElements = document.getElementsByClass("Box-body p-0 blob-wrapper data type-text  gist-border-0");
			Elements subElements = document.select("td");
			
			for (int j = 0; j < subElements.size(); j++) {
                String sub = subElements.get(j).text();
                System.out.println(sub);
            }
		}catch (IOException e) {
            e.printStackTrace();
        }

	}

}