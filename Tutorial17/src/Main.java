import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("ȫų��", 20, 175, 70, "20200101", 1, 4.5);
		Student student2 = new Student("�̼���", 30, 170, 80, "20200102", 4, 3.0);
		student1.show();
		student2.show();
		
		Teacher teacher1 = new Teacher("John Doe", 25, 180, 120, "ABC201", 3000000, 5);
		teacher1.show();
		/////////////////////////////////////////////////////////////////////////////
		Student[] students = new Student[100];
		for(int i=0; i<100; i++) {
			students[i] = new Student("ȫ�浿", 20, 175, 70, i+"", 1, 4.5);
			students[i].show();
		}
		/////////////////////////////////////////////////////////////
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� �����մϱ�?");
		int number = scan.nextInt();
		Student[] studentss = new Student[number];
		for(int i = 0; i<number; i++) {
			String name;
			int age;
			int height; 
			int weight; 
			String studentID; 
			int grade;
			double gPA;
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name =  scan.next();
			System.out.print("�л��� ���̸� �Է��ϼ��� : ");
			age =  scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height =  scan.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight =  scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentID =  scan.next();
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade =  scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA =  scan.nextDouble();
			studentss[i] = new Student( name,  age, height, weight,  studentID, grade,  gPA); 
            
		

		}
		
		for(int i=0; i<number; i++) {
		
			studentss[i].show();
		}
		
       scan.close();

	}
}
