import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(;;)//���ѷ���
		{
			System.out.println("���");
			count++;
			if(count == 10)
			{
				break;
			}
		}
		///�����///////////////////////////////////////////////////////
		Scanner scc = new Scanner(System.in); //�ܼ�â�� �����͸� System.in�� �ǹ�
		System.out.print("������ �Է��ϼ���: ");
		int i = scc.nextInt();
		System.out.println("�Է��� ������  "+ i + "�Դϴ�.");
		scc.close();
		//////���� �����/////////////////////////////////////////////////////
		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt()*100);//���ڿ��� �Է¹��� �� next()�� �޴´�.
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �о���� ���߿� ������ �߻��߽��ϴ�.");
					}
		
		
		

	}

}
