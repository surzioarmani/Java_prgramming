
public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;
	public String getName() {//마우스 우클릭 --> source --> getter, setter 자동적으로 추가 가능, 생성자도!
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Person(String name, int age, int height, int weight) {
		super();//부모 클래스의 생성자를 실행하겠다는 뜻,
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
}
