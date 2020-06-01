import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parsing {
	public static void main(String[] args) throws IOException {
		
		Document doc = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=602910&weekday=mon").get();
		String title = doc.title();
		System.out.println(title);
		
		Elements es = doc.select("td.title > a"); //title ���� a�� ���Ե� ��� �� �����´� select�� ���콺�ø��� ���ϰ� �� �� ����.
		for (int i = 0; i < es.size(); i++) { //length ���ٸ� size�� ��ü
			Element e = es.get(i);//�Ѱ�¥�� element�� ���� 
			
			String s = e.text();  //Element 'e' �� text�� s��� ������ ����
			System.out.println(s); //����
			
			System.out.println();
			
			String href = e.attr("href"); //�ּ�
			System.out.println("�ּ�â  = " + href);
		
		}
	}
}
