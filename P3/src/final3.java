import java.util.*;

/*
 * �ۼ���:����Ͻý��۰��а� 32174258 ������
 * �ۼ���¥: 2020.06.24
 * ��� : ����3
 */

/**
 * @Class Name : ${final3}
 * @Class ���� : �װ��� ���α׷�
 * @author sooaJo
 */

public class final3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aprice;//�����a �Ѱ���
		int bprice;//����� b �Ѱ���
		int cprice;//�����c �Ѱ���

		Scanner sc = new Scanner(System.in);
		plane a =new plane("PlaneA", 20, 50, 300, 1200, 700, 500);//����� a ��ü
		plane b =new plane("PlaneB", 0, 30, 100, 0, 500, 400); // �����b ��ü
		plane c =new plane("PlaneC", 20, 50, 50, 950, 850, 350);//����� c ��ü
		a.total(); //a�� �ִ� �°��� ���ϱ�
		b.total(); //b�� �ִ� �°� �� ���ϱ�
		c.total(); //c�� �ִ� �°� �� ���ϱ�
        aprice = a.price(5, 8, 0);
        bprice = b.price(7, 5, 13);
        cprice = c.price(12, 15, 20);
        
        System.out.println("planeA �Ѱ���: "+ aprice + "  planeB �Ѱ���: "+ bprice+ "  placeC �Ѱ���: "+ cprice);
        
		
		

		
	}

}

class plane{
	int pas;//�°� ��
	String name;//����� �̸�
	int first;//�۽�Ʈ �¼�
	int prestige;//������Ƽ�� �¼�
	int economy;//���ڳ�� �¼�

	int fprice;// �۽�Ʈ����
	int pprice;//���� ����
	int eprice;//���ڳ�� ����
	int tpas;//�ѽ°���
	int totalp;//����� �ѿ��
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
	 void ride(int i) {//�ش� �Լ� ȣ��� �°� �� 1�� ����
		 if(tpas ==pas) {//���̻� �°��� �¿�� ���� ��
				System.out.println("�Ұ��մϴ�.");
				return;
			}
		pas++;
	}
	 void getOff(int i) {//�ش� �Լ� ȣ��� �°� �� 1�� ����
		 if(pas==0) {//���̻� �� �°��� ������
				System.out.println("�Ұ��մϴ�.");
				return;
			}
		pas--;
	}
	

	 void ride(int i, int num) {//�ش� �Լ� ȣ���  Ÿ�� �°�����ŭ  ����
		if(tpas ==pas) {
			System.out.println("�Ұ��մϴ�.");
			return;
		}
		pas = pas + num;
	}
	 void getOff(int i, int num) {//�ش� �Լ� ȣ��� ������ �°�����ŭ  ����
		 if(pas==0) {
				System.out.println("�Ұ��մϴ�.");
				return;
			}
		pas = pas - num;
	}
	 
	public void total() { //�ִ� �°� ���� ���ϴ� �Լ��̴�.
		tpas = economy+ first+ prestige;
	}
	 
	public int price(int Fnum, int Enum, int Pnum) {//����� �� ����� ���ϰ� ��ȭ�� �Լ��̴�.
		
		totalp = (Fnum*fprice)+(Enum*eprice)+(Pnum*pprice);

		return totalp;
		
	}
	 
}

