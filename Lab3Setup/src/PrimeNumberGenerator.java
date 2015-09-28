import java.util.ArrayList;

public class PrimeNumberGenerator {

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static ArrayList<Integer> generator(int testGiven) {
		ArrayList<Integer> value = new ArrayList<Integer>();

		for (int i = 3; i < testGiven; i++) {
			if (isPrime(i)) {
				value.add(i);
			}
		}

		return value;
	}

}
