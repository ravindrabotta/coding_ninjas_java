package fundamentals;

public class DataTypesStorage {

	public static void main(String[] args) {
		char ch = 'a'; // the ASCII value of a is taken 97 and stored in binary
		int i = ch + 3;
		System.out.println(i);
				
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		System.out.println(min + " " + max);
	}
}
