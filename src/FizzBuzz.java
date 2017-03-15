/**
 * Created by moh on 15/3/17.
 */
public class FizzBuzz {

    public FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void main (String[] args) {
            FizzBuzz fb = new FizzBuzz();
    }
}
