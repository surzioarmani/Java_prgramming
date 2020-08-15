
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
		
		System.out.println(songName +" 곡을 재생합니다.");
		
	}

	@Override
	void Pause() {
		
		System.out.println("곡을 일시정지합니다.");
		
	}

	@Override
	void Stop() {
		
		System.out.println("곡을 정지합니다.");
	}

}
