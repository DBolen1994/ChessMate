package Pieces;

import Board.Board;

public abstract class Piece {

	private int x;
	private int y;
	final private boolean white;
	private String path;
	public Board board;

	public Piece(int x, int y, boolean white, String path, Board board) {
		super();
		this.x = x;
		this.y = y;
		this.white = white;
		this.path = path;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isWhite() {
		return white;
	}

	public boolean isBlack() {
		return !white;
	}

	public String getPath() {
		return path;
	}

	public boolean canMove(int destination_x, int destination_y) {
		return false;
	}
}
	

