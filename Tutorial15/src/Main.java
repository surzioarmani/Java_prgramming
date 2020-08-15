
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node(10,20);
		Node two = new Node(30,40);
		Node result = one.getCenter(two);
		System.out.println("x:"+result.getX()+", y:"+ result.getY());

	}

}
