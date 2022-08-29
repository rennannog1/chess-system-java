package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	/*static boolean possibleMoves() {
		return;
	}

	boolean possibleMove(Position position) {
		return;
	}

	boolean isThereAnyPossibleMove() {
		return;
	}*/
}
