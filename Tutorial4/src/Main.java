
public class Main {
 
	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute +"분 " + second + "초");
		
		///////////////////////초를 입력 받아 몇 분 몇 초인지 계산하는 프로그램////////////////////////////
		
		int a = 10;
		System.out.println("현재의 a는 " + a + "입니다.");
		a++;
		System.out.println("현재의 a는" + a + "입니다.");
		System.out.println("현재의 a는" + ++a + "입니다.");
		System.out.println("현재의 a는" + a++ + "입니다.");
		System.out.println("현재의 a는" + a + "입니다.");
		
		//////////////////////////////////////////////////////////////////////////////
		System.out.println(1%3);
		System.out.println(2%3);
		System.out.println(3%3);
		System.out.println(4%3);
		System.out.println(5%3);
		System.out.println(6%3);

        /////////////////////////////////////////////////////////////////////////////
		
		int A =50;
		int B =50;
		
		System.out.println("a와 b가 같은가요?"+ ( A == B));
		System.out.println("a와 b보다 큰가요?"+ ( A > B));
		System.out.println("a와 b보다 작은가요?"+ ( A < B));
		System.out.println("a와 b가 같은가요?"+ ( A == B));
		System.out.println("a와 b가 같은가요?"+ ( A == B));
		System.out.println("a가 b와 같으면서 a가 30보다 큰가요?"+ (( A == B) && (A > B)));
		System.out.println("a가 50이 아닌가요?"+ !( A == 50));
		
		///////////////////////////////////////////////////////////////////////////
		
	    int x = 50;
	    int y = 60;
	    
	    System.out.println("최댓값은"+ max(x,y)+"입니다.");
	    ///////////////////////////////////////////////////////////////////////////
	    
	    double aaa = Math.pow(3.0, 20.0);
	    System.out.println("3의 20제곱은 " +(int)aaa + "입니다.");


	}
	//반환명, 함수이름, 매개변수
	static int max(int aa, int bb) {
		int result = (aa > bb) ? aa : bb; //조건이 성립하면 aa를 성립하지 않다면 bb
		return result;
			
	}
	
    

}
