package p2;
import java.util.*;

/*
 * �ۼ���:����Ͻý��۰��а� 32174258 ������
 * �ۼ���¥: 2020.06.24
 * ��� : ����2
 */

/**
 * @Class Name : ${final2}
 * @Class ���� : ���� 2
 * @author sooaJo
 */

public class final2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int num;//���
		int num2;//�丮��
		int num3;//�׸� ����
		
		String[] r = new String[] {"���", "���� ���", "�Ұ��", "�丶��"};
		String[] t = new String[] {"����", "Ƣ��", "���� ��"};
		
		System.out.println("1.��� 2.���� ��� 3.�Ұ�� 4.�丶�� �߿��� ���ϴ� ����� ��ȣ�� �Է��ϼ���: ");
		num = sc.nextInt();
		refg ref = new refg(num);
		ref.Ingrd();
		String name = ref.getname();
	
		
		System.out.println("1.���� 2.�� 3.Ƣ�� 4.���� �� �߿��� ���ϴ� ���� ����� ��ȣ�� �Է��ϼ���: ");
		num2 = sc.nextInt();
;
		Cooker cook = new Cooker(num2,name);
		if(num==2 && num2 ==1) {//���� ������� �������� �����ϸ�
			   System.out.println("�������� ������ �Ұ��մϴ�.");
			   return;	
			}
		if(num==4 && num2 ==3) {//���� �丶��� Ƣ���� �����ϸ�
			System.out.println("�丶��� Ƣ���� �Ұ��մϴ�.");
			   return;	
		}
		
		cook.how();
		
		
		if(num2 ==4) {//���� �׸��� �����Ͽ��ٸ� 
			System.out.println("1.raw 2.medium 3.well-done ���� ������ ��ȣ�� �Է��ϼ���: ");
		    num3 = sc.nextInt();
		    grillcooker gril = new grillcooker(num2,name);
		    gril.how(num3);
		    System.out.println(gril.cook());
		    return;
		    
		    
		}
	
		System.out.println(cook.cook());
		

	}

}
class refg{//����� ������ Ŭ�����̴�.
	int n;//������ ��ȣ
	String name;//��� �̸�

	
	refg(int num){//�ʱ� ������
		n=num;
	}
	public void Ingrd() {//������ ��ȣ�� ��Ḧ �����ϴ� �Լ��̴�.
		switch(n) {
		case 1:
			name = "���";
			break;
		case 2:
			name = "���� ���";
			break;
		case 3:
			name = "�Ұ��";
			break;
		case 4:
			name = "�丶��";
			break;
		}
	}
	public String getname() {//��� �̸��� ��ȯ�Ѵ�.
		return name;
	}
}

class Cooker implements cooker_interface{//cooker_interface ��ӹ޾� ������ Cooker �丮��Ŭ�����̴�.
	int n;//�丮 �� ��ȣ
	String name;//�丮�� �̸�
	String ingrd;//����̸�
	String pork = "���� ���";
	String tomato = "�丶��";

	
	Cooker(int num, String ingrd1){//�ʱ� ������
		n=num;
		ingrd = ingrd1;
	}	
	
	public void how() {//��� ���� 
	
		switch(n) {
		case 1:
			name = "����";
			break;
		case 2:
			name = "��";
			break;
		case 3:
			name = "Ƣ��";
			break;
		case 4:
			name = "���� ��";
			break;
		}

}
	

	public String cook() {// �丮 ����� ��ȯ
		return name+"-"+ingrd;
	}
	
}

class grillcooker extends Cooker {//�׸� Ŭ�����̴�.
	
	int g;//�׸� ����� ������ ��ȣ
	String like;//�׸� ���
	String Cook;//�丮 ��
	
	grillcooker(int num, String ingrd1) {
		super(num, ingrd1);
		// TODO Auto-generated constructor stub
		super.how();
		
		Cook = cook();
		
	}
	
	public void how(int num) {//������ ��ȣ�� �׸� ��� ����
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

	
	public String cook() {//�丮 ���� ����� ��ȯ
		return name+"-"+like+" "+ingrd;
	}
	
	
	




	
}

