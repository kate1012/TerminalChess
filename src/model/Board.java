/**
 * 
 */
package model;

import java.util.HashMap;

/**
 * @author Ben Green & Kate Sussman
 *
 */
public class Board implements BoardInterface {
	
	/**HashMap of the 64 squares in the chessboard, keys numbered 1-64
	 * 
	 */
	private HashMap<Integer, Piece> squares;
	
	/**Constructor for board, initializes with a fresh set of pieces
	 * 
	 */
	public Board() {
		
	}

	@Override
	public void addPiece(String color, String type, String location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePiece(String location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movePiece(String start_location, String end_location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PieceInterface containsPiece(String location) {
		// TODO Auto-generated method stub
		return null;
	}

}
