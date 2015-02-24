/**
 * 
 */
package model;

/**
 * @author Ben Green & Kate Sussman
 *
 */
public class Piece implements PieceInterface{
	
	private String type;
	private String color;
	
	public Piece(String color, String type) {
		this.color = color;
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public boolean isWhite() {
		return color.equals("white");
	}

}
