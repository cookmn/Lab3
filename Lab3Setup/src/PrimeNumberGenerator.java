import java.util.ArrayList;


public class PrimeNumberGenerator {
	
	public static boolean isPrime(int number){
		for(int i=2; i< number; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}

	public static Object generator(int testGiven) {
		ArrayList<Integer> value = new ArrayList<Integer>();
		int max = 10000;
				
		for(int i= 2; i< testGiven; i++){
			if(isPrime(i)){
				value.add(i);
			}
		}
		

		return value;
	}

}
