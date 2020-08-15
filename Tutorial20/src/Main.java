
public class Main implements Dog,Cat{// 인터페이스를 사용하면 다중상속이 가능하다.

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		
	}

	@Override
	public void crying() {

		System.out.println("월! 월!");
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
