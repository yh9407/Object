
public class Main {
	public static void main(String[] args) {
		// Q2.//Book Ŭ���� ���� �� �ʱ�ȭ
		Book book = new Book();
		Book book1 = new Book();
		Book book2 = new Book();

		// ������ �Է�
		book.publisher = "â��";
		book1.publisher = "������å";
		book2.publisher = "�Ѻ�����";

		book.author = "Ȳ����";
		book1.author = "�ʹ� ����Ű";
		book2.author = "���ѳ�";

		book.title = "ö���� ���";
		book1.title = "�����ٺ�";
		book2.title = "��¦ �ɸ���";

		System.out.println(book);
		System.out.println(book1);
		System.out.println(book2);

		// Q1.
		Member member = new Member();

		member.id = "abcde";
		member.password = "12345";
		member.name = "ȫ�浿";
		member.age = 20;
		member.height = 178.3;

		System.out.println(member);
	}
}
