package guessing.game;

public class GuessingGame {

	private int hiddenNumber = generateRandomValue(); // toDO: make this a random value

	private int attempts = 0;

	public int getHiddenNumber() {
		return hiddenNumber;
	}

	public int getAttempts() {
		return attempts;
	}

	public String gameResponse(int guess) {
		if (isCorrect(guess)) {
			attempts = 0;
			hiddenNumber = generateRandomValue();
			return "You Win";
		} else if (isLow(guess)) {
			attempts++;
			return "Too Low";
		} else if (isHigh(guess)) {
			attempts++;
			return "Too High";
		} else {
			attempts = 0;
			hiddenNumber = generateRandomValue();
			return "Game Over";
		}
	}

	private boolean isHigh(int guess) {
		return guess > hiddenNumber && attempts < 2;
	}

	private boolean isLow(int guess) {
		return guess < hiddenNumber && attempts < 2;
	}

	private boolean isCorrect(int guess) {
		return guess == hiddenNumber;
	}

	private int generateRandomValue() {
		return (int)(Math.random() * 10 + 1);
	}
}
