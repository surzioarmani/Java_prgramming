
public class Main {
 
	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute +"�� " + second + "��");
		
		///////////////////////�ʸ� �Է� �޾� �� �� �� ������ ����ϴ� ���α׷�////////////////////////////
		
		int a = 10;
		System.out.println("������ a�� " + a + "�Դϴ�.");
		a++;
		System.out.println("������ a��" + a + "�Դϴ�.");
		System.out.println("������ a��" + ++a + "�Դϴ�.");
		System.out.println("������ a��" + a++ + "�Դϴ�.");
		System.out.println("������ a��" + a + "�Դϴ�.");
		
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
		
		System.out.println("a�� b�� ��������?"+ ( A == B));
		System.out.println("a�� b���� ū����?"+ ( A > B));
		System.out.println("a�� b���� ��������?"+ ( A < B));
		System.out.println("a�� b�� ��������?"+ ( A == B));
		System.out.println("a�� b�� ��������?"+ ( A == B));
		System.out.println("a�� b�� �����鼭 a�� 30���� ū����?"+ (( A == B) && (A > B)));
		System.out.println("a�� 50�� �ƴѰ���?"+ !( A == 50));
		
		///////////////////////////////////////////////////////////////////////////
		
	    int x = 50;
	    int y = 60;
	    
	    System.out.println("�ִ���"+ max(x,y)+"�Դϴ�.");
	    ///////////////////////////////////////////////////////////////////////////
	    
	    double aaa = Math.pow(3.0, 20.0);
	    System.out.println("3�� 20������ " +(int)aaa + "�Դϴ�.");


	}
	//��ȯ��, �Լ��̸�, �Ű�����
	static int max(int aa, int bb) {
		int result = (aa > bb) ? aa : bb; //������ �����ϸ� aa�� �������� �ʴٸ� bb
		return result;
			
	}
	
    

}
