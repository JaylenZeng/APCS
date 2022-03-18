/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck one = new Deck(
			new String[]{"Three", "Seven", "Nine", "King"},
			new String[]{"Hearts", "Diamonds", "Clubs", "Spades"},
			new int[]{3, 7, 9, 13}		
		);
		Deck two = new Deck(
			new String[]{"One", "Two", "Three", "Four"},
			new String[]{"Spades", "Spades", "Spades", "Spades"},
			new int[]{1, 2, 3, 4}
		);
		Deck three = new Deck(
			new String[]{"Five", "Five", "Five", "Five"},
			new String[]{"Diamonds", "Clubs", "Hearts", "Spades"},
			new int[]{5, 5, 5, 5}
		);
	}
}
