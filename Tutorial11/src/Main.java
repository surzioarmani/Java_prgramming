
public class Main {
 
	public static int factorial (int number) {
		int sum =1;
		for(int i =2; i<=number; i++) {
			sum *=i;
		}
		return sum;
	}
	
	public static int factorial2 (int number) {//����Լ� �̿�
		if(number ==1) {
			return 1;
		}
		else
		{
			return number*factorial2(number-1);
		}
	}
	public static void main(String[] args) {
        
       System.out.println("10���丮����"+ factorial(10));
       System.out.println("10���丮����"+ factorial2(10));

		
	}

}
