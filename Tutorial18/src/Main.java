
public class Main extends Player{

	public static void main(String[] args) {
		
		Main main = new Main();
		main.Play("Joakim Karud - Mighty Love");
		main.Pause();
		main.Stop();
		Dog dog =new Dog();
		Cat cat = new Cat();
		dog.crying();
		cat.crying();


	}

	@Override
	void Play(String songName) {
		
		System.out.println(songName +" ���� ����մϴ�.");
		
	}

	@Override
	void Pause() {
		
		System.out.println("���� �Ͻ������մϴ�.");
		
	}

	@Override
	void Stop() {
		
		System.out.println("���� �����մϴ�.");
	}

}
