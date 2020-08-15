import java.util.*;

/*
 * 작성자:모바일시스템공학과 32174258 조수아
 * 작성날짜: 2020.06.24
 * 기능 : 과제3
 */

/**
 * @Class Name : ${final3}
 * @Class 설명 : 항공사 프로그램
 * @author sooaJo
 */

public class final3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aprice;//비행기a 총가격
		int bprice;//비행기 b 총가격
		int cprice;//비행기c 총가격

		Scanner sc = new Scanner(System.in);
		plane a =new plane("PlaneA", 20, 50, 300, 1200, 700, 500);//비행기 a 객체
		plane b =new plane("PlaneB", 0, 30, 100, 0, 500, 400); // 비행기b 객체
		plane c =new plane("PlaneC", 20, 50, 50, 950, 850, 350);//비행기 c 객체
		a.total(); //a의 최대 승객수 구하기
		b.total(); //b의 최대 승객 수 구하기
		c.total(); //c의 최대 승객 수 구하기
        aprice = a.price(5, 8, 0);
        bprice = b.price(7, 5, 13);
        cprice = c.price(12, 15, 20);
        
        System.out.println("planeA 총가격: "+ aprice + "  planeB 총가격: "+ bprice+ "  placeC 총가격: "+ cprice);
        
		
		

		
	}

}

class plane{
	int pas;//승객 수
	String name;//비행기 이름
	int first;//퍼스트 좌석
	int prestige;//프레스티지 좌석
	int economy;//이코노미 좌석

	int fprice;// 퍼스트가격
	int pprice;//프레 가격
	int eprice;//이코노미 가격
	int tpas;//총승객수
	int totalp;//비행기 총요금
	plane(){
		name = "plane";
	
		 first=0;
		 prestige=0;
		 economy=0;

		 fprice=0;
		 pprice=0;
		 eprice=0;
		
	}
	
	plane(String pname,int f,int p,int e,int fp,int pp,int ep){
		name = pname;
	
		 first=f;
		 prestige=p;
		 economy=e;

		 fprice=fp;
		 pprice=pp;
		 eprice=ep;
		
	}
	 void ride(int i) {//해당 함수 호출시 승객 수 1씩 증가
		 if(tpas ==pas) {//더이상 승객을 태울수 없을 시
				System.out.println("불가합니다.");
				return;
			}
		pas++;
	}
	 void getOff(int i) {//해당 함수 호출시 승객 수 1씩 감소
		 if(pas==0) {//더이상 뺄 승객이 없을시
				System.out.println("불가합니다.");
				return;
			}
		pas--;
	}
	

	 void ride(int i, int num) {//해당 함수 호출시  타는 승객수만큼  증가
		if(tpas ==pas) {
			System.out.println("불가합니다.");
			return;
		}
		pas = pas + num;
	}
	 void getOff(int i, int num) {//해당 함수 호출시 내리는 승객수만큼  감소
		 if(pas==0) {
				System.out.println("불가합니다.");
				return;
			}
		pas = pas - num;
	}
	 
	public void total() { //최대 승객 수를 구하는 함수이다.
		tpas = economy+ first+ prestige;
	}
	 
	public int price(int Fnum, int Enum, int Pnum) {//비행기 총 요금을 구하고 반화는 함수이다.
		
		totalp = (Fnum*fprice)+(Enum*eprice)+(Pnum*pprice);

		return totalp;
		
	}
	 
}

