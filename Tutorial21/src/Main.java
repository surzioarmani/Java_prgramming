import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("바나나면 1을 복숭아라면 2를 입력해주세요 :");
		int input = scanner.nextInt();
	    if(input ==1) {
	    Fruit fruit = new Banana();
	    fruit.show();
	    }
	    else {
	    	Fruit fruit = new Peach();
	    	fruit.show();
	    }
	    scanner.close();
	}
	

}
