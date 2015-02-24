/**
 * 
 */
package model;

/**
 * @author Ben Green & Kate Sussman
 *
 */
public interface BoardInterface {
	
	/**Add chess piece to board.
	 * @param color Piece's color
	 * @param type Piece's type
	 * @param location Place on board to put piece (a4, b2, etc.)
	 */
	public void addPiece(String color, String type, String location);
	
	/**Remove piece from board.
	 * @param location Location of piece to remove
	 */
	public void removePiece(String location);
	
	/**Move piece from one place to another on board
	 * @param start_location Current location of piece
	 * @param end_location Destination of piece
	 */
	public void movePiece(String start_location, String end_location);
	
	/**Checks if a piece exists at the specified location
	 * @param location Location to search for piece
	 * @return Piece at location or null if no piece found
	 */
	public PieceInterface containsPiece(String location);

}
