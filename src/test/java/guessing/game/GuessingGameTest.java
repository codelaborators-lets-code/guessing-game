package guessing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GuessingGameTest {

	// Arrange
	GuessingGame underTest = new GuessingGame();

	@Test
	public void shouldReturn5AsTheHiddenNumber() {
		// Act
		int checkValue = underTest.getHiddenNumber();
		// Assert
		assertEquals(5, checkValue);
	}

	@Test
	public void shouldReturnYouWinWhenGuessIs5() {
		String response = underTest.gameResponse(5);
		assertEquals("You Win", response);
	}

	@Test
	public void shouldReturnTooLowWhenGuessIsBelow5() {
		String response = underTest.gameResponse(4);
		assertEquals("Too Low", response);
	}

	@Test
	public void shouldReturnTooHighWhenGuessIsAbove5() {
		String response = underTest.gameResponse(6);
		assertEquals("Too High", response);
	}

	@Test
	public void attemptsShouldStartAt0() {
		int attempts = underTest.getAttempts();
		assertEquals(0, attempts);
	}

	@Test
	public void attemptsShouldIncreaseTo1AfterIncorrectLowGuess() {
		String guess = underTest.gameResponse(4);
		int attempts = underTest.getAttempts();
		assertEquals(1, attempts);
	}

	@Test
	public void attemptsShouldIncreaseTo2AfterLowAndHighGuesses() {
		String guess1 = underTest.gameResponse(4);
		String guess2 = underTest.gameResponse(6);
		int attempts = underTest.getAttempts();
		assertEquals(2, attempts);
	}

	@Test
	public void shouldSayGameOverWith3IncorrectLowGuesses() {
		String guess1 = underTest.gameResponse(4);
		String guess2 = underTest.gameResponse(4);
		String guess3 = underTest.gameResponse(4);
		assertEquals("Game Over", guess3);
	}

	@Test
	public void shouldSayGameOverWith3IncorrectHighGuesses() {
		String guess1 = underTest.gameResponse(6);
		String guess2 = underTest.gameResponse(6);
		String guess3 = underTest.gameResponse(6);
		assertEquals("Game Over", guess3);
	}

	@Test
	public void shouldResetAttemptsWhenWon() {
		String guess1 = underTest.gameResponse(4);
		String guess2 = underTest.gameResponse(5);
		int attempts = underTest.getAttempts();
		assertEquals(0, attempts);
	}

	@Test
	public void shouldResetWith3IncorrecGuesses() {
		String guess1 = underTest.gameResponse(6);
		String guess2 = underTest.gameResponse(6);
		String guess3 = underTest.gameResponse(2);
		int attempts = underTest.getAttempts();
		assertEquals(0, attempts);
	}

}
