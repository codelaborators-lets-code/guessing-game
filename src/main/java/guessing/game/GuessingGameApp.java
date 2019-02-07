package guessing.game;

import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		GuessingGame myGame = new GuessingGame();

		System.out.println("Do you want to play(y/n)");
		String play = input.nextLine();

		while (play.equals("y")) {
			System.out.println("Enter a guess");
			int guess = input.nextInt();
			input.nextLine();
			System.out.println(myGame.gameResponse(guess));

			System.out.println("Do you want to play again(y/n)");
			play = input.nextLine();
		}
		System.out.println("Thanks for playing!");
		input.close();
	}

}
