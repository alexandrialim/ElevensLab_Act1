/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Hearts", "5", 5);
		Card card2 = new Card("Diamonds", "8", 8);
		Card card3 = new Card("Spades", "Ace", 1);
		Card card4 = new Card("Spades", "Ace", 1);
		
		System.out.println(card3.toString());
		
		System.out.println("Card 2's point value is: " + card2.pointValue());
		
		System.out.println("Card 1's rank is: " +  card1.rank());
		
		System.out.println("Card 3 and 4 should match:  " + card3.matches(card4));
		System.out.println("Does Card 1 and 4 match:  " + card1.matches(card4));
	}
}
