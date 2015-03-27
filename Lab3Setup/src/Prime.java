import java.util.ArrayList;


public class Prime {

	public static ArrayList<Integer> primefactorization(int toFactor) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(toFactor == 2){
			temp.add(2);
		} else if(toFactor == 3){
			temp.add(3);
		}
		return temp;
	}

}
