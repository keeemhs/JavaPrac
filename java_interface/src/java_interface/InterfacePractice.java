package java_interface;

interface Playable {
	void play();
	void pause();
	void stop();
}

class Mp3Player implements Playable {
	@Override
	public void play() {
		System.out.println("Mp3 재생");
	}
	@Override
	public void pause() {
		System.out.println("Mp3 일시정지");
	}
	@Override
	public void stop() {
		System.out.println("Mp3 정지");
	}
}

class DvdPlayer implements Playable {

	@Override
	public void play() {
		System.out.println("DVD 재생");
	}

	@Override
	public void pause() {
		System.out.println("DVD 일시정지");
	}

	@Override
	public void stop() {
		System.out.println("DVD 정지");
	}
	
}

public class InterfacePractice {

	public static void main(String[] args) {
		Mp3Player mp3 = new Mp3Player();
		DvdPlayer dvd = new DvdPlayer();
		mp3.play();
		mp3.pause();
		mp3.stop();
		dvd.play();
		dvd.pause();
		dvd.stop();

	}

}