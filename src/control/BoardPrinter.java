/**
 * 
 */
package control;

import model.BoardInterface;
import model.PieceInterface;

/**
 * @author Ben Green & Kate Sussman
 *
 */
public class BoardPrinter {
	
	/**Print board using specified ascii representation
	 * @param board Board to print
	 */
	public static void printBoard(BoardInterface board) {
		
		//iterate through board squares and print piece at each location
		for (Integer x = 8; x > 0; x--) {
			System.out.println();
			for (Integer y = 7; y >= 0; y--) {
				
				Integer location = x*8-y;
				PieceInterface piece = board.getPieceAt(location);
				
				//handle printing empty squares
				if (piece == null) {
					//check space color
					if (((x+y) % 2) == 0) {
						//empty black square
						System.out.print("##");
					} else {
						//empty white square
						System.out.print("  ");
					}
				
				//handle printing pieces
				} else {
					System.out.print(piece.getColor() + piece.getType());
				}
				
				//space padding between squares
				System.out.print(" ");
			}
			
			//print row number
			System.out.print(x);
		}
		
		//print column letters
		System.out.print("\n a  b  c  d  e  f  g  h");
		
		//padding below board
		System.out.println();
	}

}
