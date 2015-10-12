/**
 * Takes in a number to output all of the possible prime numbers contained within the number
 * @author jeremytimothybrown
 *
 */
public class PrimeGenerator {

	private int currentPrime;
	
	/**
	 * Constructor class.
	 * @param num the integer entered by the user
	 */
	public PrimeGenerator(int num) {
		currentPrime = num;
	}
	
	/**
	 * Tests if an integer is prime and returns true if it is.
	 * @param number the current number to be tested if prime
	 * @return boolean value
	 */
	public boolean isPrime(int number){
		
		if (number%2 != 0 && number%3 != 0 && number%5 != 0 && number%7 != 0 && number%11 != 0){
			return true;
		}
		else if (number==2 || number == 3 || number == 5 || number == 7 || number == 11){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	/**
	 * Goes down 1 to the next integer
	 * @return currentPrime the current number to be tested if prime.
	 */
	public int nextPrime(){
		currentPrime = currentPrime - 1;
		return currentPrime;
	}
	
	
}
