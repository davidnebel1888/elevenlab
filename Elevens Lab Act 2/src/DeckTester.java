/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int errorCount = 0;

		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		
		System.out.println(d);
		
		if (d.size() != 6) {
			System.out.println("Deck size test failed");
			errorCount++;
		}
		
		if (!(d.deal() instanceof Card)) {
			System.out.println("Deck Deal test failed");
			errorCount++;
		}
		
		System.out.println(d);

		
		if (d.size() != 5) {
			System.out.println("Deck size test failed");
			errorCount++;
		}
		
		if (d.isEmpty()) {
			System.out.println("Deck isEmpty test failed");
			errorCount++;
		}
		
		d.deal();
		d.deal();
		d.deal();
		d.deal();
		d.deal();
		
		if (!d.isEmpty()) {
			System.out.println("Deck isEmpty test failed");
			errorCount++;
		}
		
		System.out.println("DeckTester finished with errorCount: " + errorCount);

	}
}
