import java.util.*;

/*
 * 작성자:모바일시스템공학과 32174258 조수아
 * 작성날짜: 2020.06.24
 * 기능 : 과제1
 */

/**
 * @Class Name : ${final1}
 * @Class 설명 : 1번문제
 * @author sooaJo
 */


public class final1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int array[] = new int[100];//배열을 넣을 어레이
		int j;
		int k;
		int sum1=0;//첫번째 임의의 수 
		int sum2=0;//두번째 임의의 수
		int dif;//차이 값
		
		for(int i=0; i<100;i++) {
			array[i] =  i+1;
		}
		
		
		System.out.println("첫번째 임의 숫자를 입력하시오:");
		j= sc.nextInt();
		
		System.out.println("두번째 임의 숫자를 입력하시오:");
		k= sc.nextInt();
		
		if(j<k) {
	
		
		for(int i =0; i<100; i++) {//두 수 사이의 짝수와 홀수들의 합을 계산한다.

			  if(j<array[i] && array[i]%2 ==1 && array[i]<k) {
				  sum1 += array[i];
			  }
			  
			  if(j<array[i] && array[i]%2 ==0 && array[i]<k){
				  sum2 += array[i];
			  }
		}
		dif=k-j;//차이를 계산한다.
		}
		else {
			for(int i =0; i<100; i++) {
			  if(j>array[i] && array[i]%2 ==1 && array[i]>k) {
				  sum1 += array[i];
			  }
			  
			  if(j>array[i] && array[i]%2 ==0 && array[i]>k){
				  sum2 += array[i];
			  }
			}
			dif=j-k;
		}
		
		System.out.println("홀수의 합 : "+ sum1);
		System.out.println("짝수의 합: "+ sum2);
		System.out.println("두 수의 차이는 : "+ dif);
	
	}

}

