
public class MethodExam {
	// Q. �� ���� �Է¹޾Ƽ� ū ���� ��ȯ�ϴ� ����� �޼ҵ����
	int getMaxValue(int v1, int v2) {
		// ����Ÿ�� , �޼ҵ� �� ( , )
		if (v1 > v2) {
			return v1;
		} else {
			return v2;
		}
		// return = 0;
	}

	public static void main(String[] args) {
		MethodExam e = new MethodExam();
		int max = e.getMaxValue(100, 102); // ������ �޼ҵ带 max��� ������ ��� ���
		System.out.println(max);
	}
}
