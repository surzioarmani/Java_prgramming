import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ٳ����� 1�� �����ƶ�� 2�� �Է����ּ��� :");
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
