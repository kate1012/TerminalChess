/**
 * 
 */
package control;

import java.util.StringTokenizer;

import model.Board;

/**
 * @author Ben Green & Kate Sussman
 *
 */
public class MoveChecker {

	public static boolean isValidMove(Board board, String move) {
		Integer[]parsed_move = parseMove(move);
		if (parsed_move == null) {
			return false;
		}
		return true;
	}
	
	/**Parses 'move' parameter into numbers representing current and destination squares
	 * @param move Move formatted like 'e2 e4'
	 * @return Integer array of size 2 with Integer representations of the move. For
	 * example, 'e2 e4' would become [13, 29]. Null is returned if the one or both of the
	 * squares given are nonsensical, or if something else is wrong with the input.
	 */
	public static Integer[] parseMove(String move) {
		
		//initialize return array
		Integer[] parsed_moves = new Integer[2];
		
		//parse move into tokens
		StringTokenizer tokz = new StringTokenizer(move);
		
		//check that only two arguments exist - current location and destination
		if (tokz.countTokens() != 2) {
			return null;
		}
		
		//iterate through tokens and parse each one into return array
		for (int x = 0; x < 2; x++) {
			String token = tokz.nextToken().toLowerCase();
			
			//check each location for length
			if (token.length() != 2) {
				System.err.println("Invalid number of moves");
				return null;
			//check that first char is a letter and second char is a number
			} else if (!Character.isLetter(token.charAt(0)) || (!Character.isDigit(token.charAt(1)))) {
				System.err.println("Invalid char types in moves");
				return null;
			//check that letter is between a-h and number is between 1-8
			} else if ((Character.getNumericValue(token.charAt(0))) > 17 || ((Character.getNumericValue(token.charAt(1)) > 8))) {

				System.err.println("Invalid move range");
				return null;
			}
			System.out.println(parsed_moves[x]);
			parsed_moves[x] = (Character.getNumericValue(token.charAt(0))-9) + (Character.getNumericValue(token.charAt(1)-1) * 8);
			System.out.println(parsed_moves[x]);
		}
		
		return parsed_moves;
	}

}
