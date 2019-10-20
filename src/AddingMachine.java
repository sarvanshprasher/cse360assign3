 /**
 * Zhengjun Li
 * Class ID: 70641
 * CSE 360 - Callis - Monday
 * 1216057583
 * Assignment3:
 * AddingMachine class that runs add or subtract on a property of the class. It can also display operation history
 */

/** Represents a calculator
 * @version 1.1 second commit
 */
public class AddingMachine {

	public int total;

	//operations will add history to this string
    public String history = "0";

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}

	/** returns total value as int
	 * @return total
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * adds param to total
	 * @param value to be added
	 */
	public void add (int value) {
		this.history = this.history + " + " + value;
		this.total = this.total + value;
	}

	/**
	 * subtracts param from total
	 * @param value to subtract
	 */
	public void subtract (int value) {
		this.history = this.history + " - " + value;
		this.total = this.total - value;
	}

	/**
	 * returns transaction history
	 * @return history string
	 */
	public String toString () {
		return history;
	}

	/**
	 * clears history and total
	 */
	public void clear() {
		history = "";
		total = 0;
	}
}
