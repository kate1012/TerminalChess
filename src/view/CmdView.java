/**
 * 
 */
package view;

import control.BoardPrinter;
import model.Board;

/**
 * @author Ben Green & Kate Sussman
 *
 */
public class CmdView {

	public static void main(String[] args) {
		
		//initialize board
		Board board = new Board();
		
		BoardPrinter.printBoard(board);

	}

}
