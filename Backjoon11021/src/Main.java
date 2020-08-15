import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       
        String[] test = new String[size];
        
        for (int i = 0; i< size; i++) {
        	 int count = 0; 
        	 int sum = 0;
        	 test[i] = sc.next();
        	 for(int j = 0; j < test[i].length();j++) {
        		 if( test[i].charAt(j) == 'O')
        			 sum += ++count;
        		 else count = 0;
        	 }
             System.out.println(sum);          
        }
      
        sc.close();
    }
}
