
public class Book {
	
	String publisher;
	String author;
	String title;
	//�ѹ��� �Ϸ��� Book class library�� �迭�� ���� �迭�� �ѱ�
	//�ʵ� �ۼ�
	@Override
	public String toString() {
		return "Book [publisher=" + publisher +
				", author=" + author + ", title=" +
				title + "]";
	}
}
