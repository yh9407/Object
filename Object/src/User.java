//library
public class User {
	int age;
	String name;
	Car car; //������ �ڷ��� 'Car'
	
	//source - > generate toString//
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" +
	name + ", car=" + car + "]";
		
	}
}
