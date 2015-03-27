import java.util.ArrayList;

public class Prime {

	public static ArrayList<Integer> primefactorization(int toFactor) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		factors = PrimeNumberGenerator.generator(toFactor);

		if (toFactor == 2) {
			temp.add(2);
		} else if (toFactor == 3) {
			temp.add(3);
		}

		for (int i = 0; i < factors.size(); i++) {
			while (toFactor % factors.get(i) == 0) {
				temp.add(factors.get(i));
				toFactor = toFactor / (factors.get(i));
			}
		}
		return temp;
	}

}
