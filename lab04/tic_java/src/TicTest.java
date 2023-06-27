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

	@Test
	void getNumberOfRowsTest() {
		Tic board = new Tic (3,3);
	
		assertEquals(3, board.getNumberOfRows());
	}

	@Test
	void getNumberOfColumnsTest() {
		Tic board = new Tic (3,3);
	
		assertEquals(3, board.getNumberOfRows());
	}
	
	@Test
	void isFullTest() {
		Tic board = new Tic (3,3);
		board.place("X", 0, 0);
		board.place("O", 0, 1);
		board.place("X", 0, 2);
		board.place("O", 1, 0);
		board.place("X", 1, 1);
		board.place("O", 1, 2);
		board.place("X", 2, 0);
		board.place("O", 2, 1);
		board.place("X", 2, 2);
		
		assertEquals(true, board.isFull());	
	}
}
