import java.util.Scanner; //ctrl+shift+o를 누르면 알아서 import가 된다.

public class Main {//배열 : 랜덥정수로 평균 구하기, 배열 생성 및 최대값 구하기

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
		System.out.println("100개의 랜덤 정수의 평균 값은 " +sum /100 +"입니다");
		
		
		///////////////////////////////////////////////////////////////////
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요:");
		int number = scanner.nextInt();
		int [] array = new int[number];
		for(int i =0; i<number; i++) {
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요(양수):");
			array[i]=scanner.nextInt();
		}
		int result =-1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("입력한 모든 정수 중에서 가장 큰 값은:"+ result);
       scanner.close();
	}

}
