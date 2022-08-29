package Pieces;

import Board.Board;

public class Rook extends Piece {

	private boolean hasMoved;

	public Rook(int x, int y, boolean white, String path, Board board) {
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

		// Rook: able to move as many squares forward, backward, and sideways. Cannot
		// jump any pieces.
		// And cannot attack own pieces.
		
		// Is there a piece in the way?

		// Can only move in a straight line.

		return true;
	}
}
