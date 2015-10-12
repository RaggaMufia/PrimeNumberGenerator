import java.util.Scanner;

/**
 * Prints all primes up to a user entered number.
 * @author jeremytimothybrown Change this.  
 *
 */
public class PrimePrinter {

	/**
	 * Asks for a number.  Prints the primes up to that number.
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int max = scan.nextInt();
		
		System.out.print("\nHere are the primes up to that number: ");
		
		PrimeGenerator generator = new PrimeGenerator(max);
		while (max != 0){
			boolean ans = generator.isPrime(max);
			if (ans){System.out.print(max+", ");}
			max = generator.nextPrime();
		}
		
		//System.out.println("Here are the primes up to that number: "+primeList);
		
	}

}
