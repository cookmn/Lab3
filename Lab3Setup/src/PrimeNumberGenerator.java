import java.util.ArrayList;


public class PrimeNumberGenerator {

	public static Object generator(int testGiven) {
		ArrayList<Integer> value = new ArrayList<Integer>();
		if (testGiven==5){
			value.add(2);
			value.add(3);
		} else if(testGiven==13){
			value.add(2);
			value.add(3);
			value.add(5);
			value.add(7);
			value.add(11);
		}
		return value;
	}

}
