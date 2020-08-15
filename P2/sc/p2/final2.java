package p2;
import java.util.*;

/*
 * 작성자:모바일시스템공학과 32174258 조수아
 * 작성날짜: 2020.06.24
 * 기능 : 과제2
 */

/**
 * @Class Name : ${final2}
 * @Class 설명 : 과제 2
 * @author sooaJo
 */

public class final2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int num;//재료
		int num2;//요리법
		int num3;//그릴 정도
		
		String[] r = new String[] {"계란", "돼지 고기", "소고기", "토마토"};
		String[] t = new String[] {"날것", "튀김", "구운 것"};
		
		System.out.println("1.계란 2.돼지 고기 3.소고기 4.토마토 중에서 원하는 재료의 번호를 입력하세요: ");
		num = sc.nextInt();
		refg ref = new refg(num);
		ref.Ingrd();
		String name = ref.getname();
	
		
		System.out.println("1.날것 2.찜 3.튀김 4.구운 것 중에서 원하는 조리 방법의 번호를 입력하세요: ");
		num2 = sc.nextInt();
;
		Cooker cook = new Cooker(num2,name);
		if(num==2 && num2 ==1) {//만약 돼지고기 날것으로 선택하면
			   System.out.println("돼지고기는 날것이 불가합니다.");
			   return;	
			}
		if(num==4 && num2 ==3) {//만약 토마토로 튀김을 선택하면
			System.out.println("토마토는 튀김이 불가합니다.");
			   return;	
		}
		
		cook.how();
		
		
		if(num2 ==4) {//만약 그릴을 선택하였다면 
			System.out.println("1.raw 2.medium 3.well-done 구운 정도의 번호를 입력하세요: ");
		    num3 = sc.nextInt();
		    grillcooker gril = new grillcooker(num2,name);
		    gril.how(num3);
		    System.out.println(gril.cook());
		    return;
		    
		    
		}
	
		System.out.println(cook.cook());
		

	}

}
class refg{//냉장고를 구현한 클래스이다.
	int n;//선택한 번호
	String name;//재료 이름

	
	refg(int num){//초기 생성자
		n=num;
	}
	public void Ingrd() {//선택한 번호로 재료를 선택하는 함수이다.
		switch(n) {
		case 1:
			name = "계란";
			break;
		case 2:
			name = "돼지 고기";
			break;
		case 3:
			name = "소고기";
			break;
		case 4:
			name = "토마토";
			break;
		}
	}
	public String getname() {//재료 이름을 반환한다.
		return name;
	}
}

class Cooker implements cooker_interface{//cooker_interface 상속받아 구현한 Cooker 요리법클래스이다.
	int n;//요리 법 번호
	String name;//요리법 이름
	String ingrd;//재료이름
	String pork = "돼지 고기";
	String tomato = "토마토";

	
	Cooker(int num, String ingrd1){//초기 생성자
		n=num;
		ingrd = ingrd1;
	}	
	
	public void how() {//방법 선택 
	
		switch(n) {
		case 1:
			name = "날것";
			break;
		case 2:
			name = "찜";
			break;
		case 3:
			name = "튀김";
			break;
		case 4:
			name = "구운 것";
			break;
		}

}
	

	public String cook() {// 요리 결과를 반환
		return name+"-"+ingrd;
	}
	
}

class grillcooker extends Cooker {//그릴 클래스이다.
	
	int g;//그릴 방법을 선택한 번호
	String like;//그릴 방법
	String Cook;//요리 법
	
	grillcooker(int num, String ingrd1) {
		super(num, ingrd1);
		// TODO Auto-generated constructor stub
		super.how();
		
		Cook = cook();
		
	}
	
	public void how(int num) {//선택한 번호로 그릴 방법 선택
		g=num;

		switch(g) {
		case 1:
			like = "raw";
			break;
		case 2:
			like = "medium";
			break;
		case 3:
			like = "well-done";
			break;
		}
	}

	
	public String cook() {//요리 과정 결과를 반환
		return name+"-"+like+" "+ingrd;
	}
	
	
	




	
}

