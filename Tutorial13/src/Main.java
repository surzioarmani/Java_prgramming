import java.util.Scanner; //ctrl+shift+o�� ������ �˾Ƽ� import�� �ȴ�.

public class Main {//�迭 : ���������� ��� ���ϱ�, �迭 ���� �� �ִ밪 ���ϱ�

	public static int max( int a, int b) {
		return (a>b)? a: b;
	}
	
	public static void main(String[] args) {
		
		int [] array2 =  new int[100];
		for(int a=0; a<100; a++) {
			array2[a] = (int)(Math.random()*100 +1);
		}
		int sum = 0;
		for( int b=0; b<100; b++) {
			sum +=array2[b];
		}
		System.out.println("100���� ���� ������ ��� ���� " +sum /100 +"�Դϴ�");
		
		
		///////////////////////////////////////////////////////////////////
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ���:");
		int number = scanner.nextInt();
		int [] array = new int[number];
		for(int i =0; i<number; i++) {
			System.out.print("�迭�� �Է��� ������ �ϳ��� �Է��ϼ���(���):");
			array[i]=scanner.nextInt();
		}
		int result =-1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("�Է��� ��� ���� �߿��� ���� ū ����:"+ result);
       scanner.close();
	}

}
