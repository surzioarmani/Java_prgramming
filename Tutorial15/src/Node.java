
public class Node {

	private int x;
	private int y;//private은 외부에서 함부로 접근할 수 없음
	
	public int getX() { //외부에서 접근할 수 있다는 뜻으로 public
		return x;
	}
	
	public void setX(int x) {//굳이 만든이유는 보안때문에! 함부로 접근 못하니까 private접근할 수 있도록 만들어둔거야
		this.x = x;//this란 가지고 있는 고유한 엑스의 값을 바꿔줄때  즉 위에 있는 x를 새로 매개변수로 들어온 x를 값을 매기겠다.
	}

	public int getY() { //외부에서 접근할 수 있다는 뜻으로 public
	return y;
	}
	
	public void setY(int y) {
	this.y = y;//this란 가지고 있는 고유한 엑스의 값을 바꿔줄때  즉 위에 있는 x를 새로 매개변수로 들어온 x를 값을 매기겠다.
    }
	public Node(int x, int y) {//생성자 리셋시켜주는거
		this.x = x;
		this.y = y;
	}
	public Node getCenter(Node other) {//다른 노드를 받아서 비교해서 정 중앙을 반환하도록 따라서 반환형을 Node
		return new Node((this.x + other.getX())/2, (this.y + other.getY())/2);
	}
	
}
