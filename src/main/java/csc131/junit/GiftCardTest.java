package csc131.junit;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 
import org.junit.rules.ExpectedException; 

// Test suite.
public class GiftCardTest {

	@Test
	public void getIssuingStore() {

		double balance;
		GiftCard card;
		int issuingStore;

		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);

		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		// String description, int expected (1337), int actual.
	}

	@Test
	public void getBalance() {

		double balance;
		GiftCard card;
		int issuingStore;

		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);

		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
		// String description, double expected, double actual, double tolerance.
	}

	@Test
	public void deduct_RemainingBalance() {

		double balance;
		GiftCard card;
		int issuingStore;
		String out;

		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);

		out = "Remaining Balance: " + String.format("%6.2f", 90.00);
		assertEquals("deduct(10.00)", out, card.deduct(10.0));
	}
}
