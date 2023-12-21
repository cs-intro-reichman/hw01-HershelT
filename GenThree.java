
/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;
import java.util.*;
public class GenThree {
    public static void main(String[] args) {
        // Put your code here
        int minNumber = Integer.parseInt(args[0]);
        int maxNumber = Integer.parseInt(args[1]);
        gen3(minNumber, maxNumber);
    }
    public static void gen3(int min, int max) {

        Random random = new Random();
        int mini = random.ints(min, max) //Using Stream declares random range
                .limit(3) //sets the limit of how many random numbers
                .peek(System.out::println)//uses .peek to print out each random number on new line
                .min()
                .getAsInt(); //uses .min function to get the minimum number and sets it to int mini
        System.out.println("The minimal number generated was " + mini);
    }
}
