/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		addTwo(0, 100);
	}
	public static void addTwo(int one, int two){
		int answer = one + two;
		System.out.println(one + " + " + two + " = " + answer );
	}
}
