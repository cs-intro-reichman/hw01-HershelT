/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Put your code here
		gen3(109, 132435);
	}
	public static void triangle(int a, int b, int c) {
		String nums = String.format("%d, %d, %d: ",a,b,c);
		boolean ans = (a + b) > c;
		System.out.println(nums + ans);
	}
}
