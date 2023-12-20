/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		coins(464);
	}
	public static void coins(int amount){
		int quarters = amount / 25;
		int cents = amount % 25;
		System.out.printf("Use %d quarters and %d cents\n", quarters, cents);
	}
}