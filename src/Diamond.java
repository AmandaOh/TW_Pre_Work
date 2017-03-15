/**
 * Created by moh on 15/3/17.
 */
public class Diamond {

    public void isosTgl(int n) {
          int spaceCount = n - 1;
          int astCount = 0;
          for (int i = 0; i < n; i ++) {
              for (int j = spaceCount; j >= 0; j --) {
                   System.out.print(" ");
              }
              for (int j = 0; j <= astCount; j++) {
                    System.out.print("*");
              }
              System.out.print("\n");
              astCount += 2;
              spaceCount--;
          }
    }
    public static void main(String[] args) {
        Diamond d = new Diamond();
        System.out.println("Print a centered triangle");
        d.isosTgl(3);
        
    }
}
