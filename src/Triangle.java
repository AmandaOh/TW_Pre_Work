/**
 * Created by moh on 15/3/17.
 */
public class Triangle {

    public void horizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void verticalLine(int n) {
        for( int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void right(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalLine(i);
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Print one asterisk");
        System.out.println("*");
        //print horizontal line
        System.out.println("Draw a horizontal line");
        Triangle t = new Triangle();
        t.horizontalLine(5);
        System.out.println("\n" +"Draw a vertical line");
        t.verticalLine(3);
        System.out.println("Draw a right triangle");
        t.right(3);
    }
}
