//library and ��������Ʈ
public class Car {
		int tire;
		double engine;
		double Break;
		String brand;
		
		public Car() {}
		public Car(int tire) {
			//tire = tire; //tire �ߺ�. � tire���� ������ ����� 
			//���� �����ɷ� ��.
			this.tire = tire;
			//this�� ���� Ŭ���������� �ǹ���.
		}
		@Override   //����� �ɷ� Over loading [���� >syso]
		public String toString() {
			return "Car [tire=" + tire + ", engine=" + engine + ", Break=" + Break + ", brand=" + brand + "]";
		}
	}

