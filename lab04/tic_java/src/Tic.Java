package lab04;

public class Tic {

	String[][] board;
	int rows;
	int cols;
	String turn;
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
            }
        }
    }

    public String getCell(int row, int column) {
		String cell = board[row][column];
		return cell;
	}

	public void place(String value, int row, int column) {
		board[row][column] = value;
	}

	public Integer getNumberOfRows() {
		return rows;
	}

	public Integer getNumberOfColumns() {
		return null;
	}
}