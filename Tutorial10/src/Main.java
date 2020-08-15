
public class Main {

	public static int function(int number, int k) {
		for(int i = 1; i<= number; i++)
		{
			if(number % i ==0)
			{
				k--;
				if(k==0)
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public static char function2(String input) {
		return input.charAt(input.length() - 1);
	}
	
	public static int max(int a, int b) {
		return (a>b)? a : b;
	}
	public static int function3(int a, int b, int c) {
		int result = max(a,b);
		result = max(result, c);
		return result;
	}
	
	public static void main(String[] args) {
		int result = function(3050, 10);
		if(result == -1) {
			System.out.println("3050의 10번째 약수는 없습니다.");
		}
		else
		{
			System.out.println("3050의 10번째 약수는" + result+"입니다");
		}
		
		System.out.println("Hello world의 마지막 단어는 " +function2("Hello world"));

		System.out.println("(345, 567, 789) 중에서 가장 큰 값은 "+ function3(345,567,789));
	}

	
}
