/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int one = Integer.parseInt(args[0]);
		int two = Integer.parseInt(args[1]);
		addTwo(one, two);
	}
	public static void addTwo(int one, int two){
		int answer = one + two;
		System.out.println(one + " + " + two + " = " + answer );
	}
}
