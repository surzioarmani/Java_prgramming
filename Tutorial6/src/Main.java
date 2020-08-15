
public class Main {
	
	final static int N = 30;
	final static int M= 15;

	public static void main(String[] args) {
		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("B+입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("C+입니다.");
		}
		else 
		{
			System.out.println("f입니다.");
		}
	
	//////////////////////////////////////////////////////////
	
	String a = "Man";
	int b = 0;
	 //자바는 string을 비교할 때 equal()을 이용한다.
	// 그이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문이다.
	
	if(a.equals("Man"))
	{
		System.out.println("남자입니다.");
		
	}
	else
	{
		System.out.println("남자가 아닙니다.");
	}
	if(b == 3)
	{
		System.out.println("b는 3입니다.");
	}
	else
	{
		System.out.println("b는 3이 아닙니다.");
	}
	
	if(a.equalsIgnoreCase("Man") && b ==0)// 대소문자 구분없이 
	{
		System.out.println("참입니다.");
	}
	else
	{
		System.out.println("거짓입니다.");
	}
	

	
	int i = 1, sum = 0;
	while(i <= 1000)
	{
		sum += i++;
		
	}
	System.out.println("1부터 1000까지의 합은:"+ sum + "입니다.");
///////////////////////////////////////////////////////////////////
	// for문은  초기화 부분, 조건 부분, 연산 부분으로 이루어져 있다.
	for(int x = N; x > 0; x--)
	{
		for(int j = x; j > 0; j--)
		{
		System.out.print("*"); //줄바꿈 없이
	    }
	    
		System.out.println();//*표시 줄바꾸기
	}
	/////////////////////////////////////////////////////////////////
	//x^2 + y^2 = r^2  원 만들기 
	for(int y = -M; y <=M ; y++)
	{
		for(int j = - M; j <= M; j++)
		{
			if( y * y + j * j <= M * M)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			
		    }
		}
	
	 System.out.println();
	}
	
	}
	
}
