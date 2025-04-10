/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		int errorCount = 0;
		
		Card cardA = new Card("Ace", "Heart", 1);
		Card cardB = new Card("Two", "Spade", 2);
		Card cardC = new Card("Queen", "Club", 12);
		Card cardC2 = new Card("Queen", "Club", 12);
		
		// cardA tests
		if(!cardA.rank().equals("Ace")) {
			System.out.println("cardA rank test failed");
			errorCount++;
		}
		
		if(!cardA.suit().equals("Heart")) {
			System.out.println("cardA suit test failed");
			errorCount++;
		}
		
		if(cardA.pointValue() != 1) {
			System.out.println("cardA pointValue test failed");
			errorCount++;
		}
		
		// cardB tests
		if(!cardB.rank().equals("Two")) {
			System.out.println("cardB rank test failed");
			errorCount++;
		}
		
		if(!cardB.suit().equals("Spade")) {
			System.out.println("cardB suit test failed");
			errorCount++;
		}
		
		if(cardB.pointValue() != 2) {
			System.out.println("cardB pointValue test failed");
			errorCount++;
		}
		
		// cardC tests
		if(!cardC.rank().equals("Queen")) {
			System.out.println("cardC rank test failed");
			errorCount++;
		}
		
		if(!cardC.suit().equals("Club")) {
			System.out.println("cardC suit test failed");
			errorCount++;
		}
		
		if(cardC.pointValue() != 12) {
			System.out.println("cardC pointValue test failed");
			errorCount++;
		}
		
		// matches tests
		if (cardA.matches(cardC)) {
			System.out.println("cardA matches test failed");
			errorCount++;
		}
		
		if (!cardC.matches(cardC2)) {
			System.out.println("cardC matches test failed");
			errorCount++;
		}
		
		
		System.out.println("CardTester finished with errorCount: " + errorCount);
	}
}
