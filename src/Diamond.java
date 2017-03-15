/**
 * Created by moh on 15/3/17.
 */
public class Diamond {

    private int astCount;
    private int spaceCount;

    public Diamond(int n) {
          isosTgl(n);
          astCount -= 4;
          spaceCount+= 2;
          for (int i = 0; i < n -1; i++) {
              for (int j = 0; j < spaceCount; j++) {
                  System.out.print(" ");
              }
              for (int k = astCount; k >= 0; k--) {
                  System.out.print("*");
              }
              System.out.print("\n");
              astCount -= 2;
              spaceCount++;
          }
    }

    public void isosTgl(int n) {
          astCount = 0;
          spaceCount = n - 1;
          for (int i = 0; i < n; i ++) {
              for (int j = spaceCount; j > 0; j --) {
                   System.out.print(" ");
              }
              for (int k = 0; k <= astCount; k++) {
                    System.out.print("*");
              }
              System.out.print("\n");
              astCount += 2;
              spaceCount--;
          }
    }
    public static void main(String[] args) {
        System.out.println("Print a Diamond");
        Diamond d = new Diamond(6);

        System.out.println("Print a centered triangle");
        d.isosTgl(3);
    }
}
