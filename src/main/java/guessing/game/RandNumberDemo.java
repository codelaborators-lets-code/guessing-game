package guessing.game;

public class RandNumberDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int value = (int) (Math.random() * 10 + 1);
			System.out.println(value);
		}

	}

}
