import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(;;)//무한루프
		{
			System.out.println("출력");
			count++;
			if(count == 10)
			{
				break;
			}
		}
		///입출력///////////////////////////////////////////////////////
		Scanner scc = new Scanner(System.in); //콘솔창의 데이터를 System.in이 의미
		System.out.print("정수를 입력하세요: ");
		int i = scc.nextInt();
		System.out.println("입력한 정수는  "+ i + "입니다.");
		scc.close();
		//////파일 입출력/////////////////////////////////////////////////////
		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt()*100);//문자열을 입력받을 땐 next()로 받는다.
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
					}
		
		
		

	}

}
