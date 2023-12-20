
/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;
public class GenThree {
    public static void main(String[] args) {
        // Put your code here
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        gen3(min, max);
    }
    public static void gen3(int min, int max) {

        Random random = new Random();
        int mini = random.ints(min, max)
                .limit(3)
                .peek(System.out::println)
                .min()
                .getAsInt();
        System.out.println("The minimal number generated was " + mini);
    }
}
