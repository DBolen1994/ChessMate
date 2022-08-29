package Pieces;

import Board.Board;

public class Queen extends Piece {

	private boolean hasMoved;

	public Queen(int x, int y, boolean white, String path, Board board) {
		super(x, y, white, path, board);
		this.hasMoved = false;
	}

	public boolean isHasMoved() {
		return hasMoved;
	}

	public void setHasMoved(boolean hasMoved) {
		this.hasMoved = hasMoved;
	}

	public boolean canMove(int destination_x, int destination_y) {

		//

		return true;
	}
}
