import java.util.*;

/*
 * �ۼ���:����Ͻý��۰��а� 32174258 ������
 * �ۼ���¥: 2020.06.24
 * ��� : ����1
 */

/**
 * @Class Name : ${final1}
 * @Class ���� : 1������
 * @author sooaJo
 */


public class final1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int array[] = new int[100];//�迭�� ���� ���
		int j;
		int k;
		int sum1=0;//ù��° ������ �� 
		int sum2=0;//�ι�° ������ ��
		int dif;//���� ��
		
		for(int i=0; i<100;i++) {
			array[i] =  i+1;
		}
		
		
		System.out.println("ù��° ���� ���ڸ� �Է��Ͻÿ�:");
		j= sc.nextInt();
		
		System.out.println("�ι�° ���� ���ڸ� �Է��Ͻÿ�:");
		k= sc.nextInt();
		
		if(j<k) {
	
		
		for(int i =0; i<100; i++) {//�� �� ������ ¦���� Ȧ������ ���� ����Ѵ�.

			  if(j<array[i] && array[i]%2 ==1 && array[i]<k) {
				  sum1 += array[i];
			  }
			  
			  if(j<array[i] && array[i]%2 ==0 && array[i]<k){
				  sum2 += array[i];
			  }
		}
		dif=k-j;//���̸� ����Ѵ�.
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
		
		System.out.println("Ȧ���� �� : "+ sum1);
		System.out.println("¦���� ��: "+ sum2);
		System.out.println("�� ���� ���̴� : "+ dif);
	
	}

}

