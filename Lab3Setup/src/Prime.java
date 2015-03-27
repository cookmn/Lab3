import java.util.ArrayList;


public class Prime {

	public static ArrayList<Integer> primefactorization(int toFactor) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while (toFactor%2 == 0){
			temp.add(2);
			toFactor = toFactor / 2;
		} while(toFactor % 3 == 0){
			temp.add(3);
			toFactor = toFactor / 3;
		} 
		return temp;
	}

}
