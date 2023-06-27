package lab04;

import static org.junit.jupiter.api.Assertions.*;

public class TicTest {
    @Test
	void getCell() {
		Tic board = new Tic (3,3);
		assertEquals("_", board.getCell( 1, 2));
	}
}
