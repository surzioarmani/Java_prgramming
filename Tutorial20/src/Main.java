
public class Main implements Dog,Cat{// �������̽��� ����ϸ� ���߻���� �����ϴ�.

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		
	}

	@Override
	public void crying() {

		System.out.println("��! ��!");
	}

	@Override
	public void show() {

		System.out.println("Hello world");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		
	}

}
