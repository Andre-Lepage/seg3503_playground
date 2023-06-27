package lab04;

import static org.junit.jupiter.api.Assertions.*;

public class TicTest {
    @Test
	void getCell() {
		Tic board = new Tic (3,3);
		assertEquals("_", board.getCell( 1, 2));
	}

	@Test
	void playTest() {
		Tic board = new Tic (3,3);
		board.place("X", 1, 2);
		assertEquals("X", board.getCell( 1, 2));	
	}
}
