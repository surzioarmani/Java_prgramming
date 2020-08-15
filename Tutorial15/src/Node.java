
public class Node {

	private int x;
	private int y;//private�� �ܺο��� �Ժη� ������ �� ����
	
	public int getX() { //�ܺο��� ������ �� �ִٴ� ������ public
		return x;
	}
	
	public void setX(int x) {//���� ���������� ���ȶ�����! �Ժη� ���� ���ϴϱ� private������ �� �ֵ��� �����аž�
		this.x = x;//this�� ������ �ִ� ������ ������ ���� �ٲ��ٶ�  �� ���� �ִ� x�� ���� �Ű������� ���� x�� ���� �ű�ڴ�.
	}

	public int getY() { //�ܺο��� ������ �� �ִٴ� ������ public
	return y;
	}
	
	public void setY(int y) {
	this.y = y;//this�� ������ �ִ� ������ ������ ���� �ٲ��ٶ�  �� ���� �ִ� x�� ���� �Ű������� ���� x�� ���� �ű�ڴ�.
    }
	public Node(int x, int y) {//������ ���½����ִ°�
		this.x = x;
		this.y = y;
	}
	public Node getCenter(Node other) {//�ٸ� ��带 �޾Ƽ� ���ؼ� �� �߾��� ��ȯ�ϵ��� ���� ��ȯ���� Node
		return new Node((this.x + other.getX())/2, (this.y + other.getY())/2);
	}
	
}
