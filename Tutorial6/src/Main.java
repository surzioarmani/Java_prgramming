
public class Main {
	
	final static int N = 30;
	final static int M= 15;

	public static void main(String[] args) {
		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+�Դϴ�.");
		}
		else if(score >= 80)
		{
			System.out.println("B+�Դϴ�.");
		}
		else if(score >= 70)
		{
			System.out.println("C+�Դϴ�.");
		}
		else 
		{
			System.out.println("f�Դϴ�.");
		}
	
	//////////////////////////////////////////////////////////
	
	String a = "Man";
	int b = 0;
	 //�ڹٴ� string�� ���� �� equal()�� �̿��Ѵ�.
	// �������� String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� �����̴�.
	
	if(a.equals("Man"))
	{
		System.out.println("�����Դϴ�.");
		
	}
	else
	{
		System.out.println("���ڰ� �ƴմϴ�.");
	}
	if(b == 3)
	{
		System.out.println("b�� 3�Դϴ�.");
	}
	else
	{
		System.out.println("b�� 3�� �ƴմϴ�.");
	}
	
	if(a.equalsIgnoreCase("Man") && b ==0)// ��ҹ��� ���о��� 
	{
		System.out.println("���Դϴ�.");
	}
	else
	{
		System.out.println("�����Դϴ�.");
	}
	

	
	int i = 1, sum = 0;
	while(i <= 1000)
	{
		sum += i++;
		
	}
	System.out.println("1���� 1000������ ����:"+ sum + "�Դϴ�.");
///////////////////////////////////////////////////////////////////
	// for����  �ʱ�ȭ �κ�, ���� �κ�, ���� �κ����� �̷���� �ִ�.
	for(int x = N; x > 0; x--)
	{
		for(int j = x; j > 0; j--)
		{
		System.out.print("*"); //�ٹٲ� ����
	    }
	    
		System.out.println();//*ǥ�� �ٹٲٱ�
	}
	/////////////////////////////////////////////////////////////////
	//x^2 + y^2 = r^2  �� ����� 
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
