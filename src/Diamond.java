/**
 * Created by moh on 15/3/17.
 */
public class Diamond {

    private int astCount;
    private int spaceCount;
    private String name;

    public Diamond(int n, String ...s) {
          name = s.length > 0 ? s[0] : null;

          if ( name == null ) {
              isosTgl(n);
              astCount -= 4;
              spaceCount+= 2;
          } else if ( name.length() > 0 ) {
              spaceCount = n - 1;
              astCount = 1;
              for (int i = 0; i < n - 1; i++) {
                  for (int j = spaceCount; j > 0 ; j--) {
                      System.out.print(" ");
                  }
                  for (int k = 0; k < astCount; k++) {
                      System.out.print("*");
                  }
                  System.out.print("\n");
                  spaceCount--;
                  astCount += 2;
              }
              System.out.println(name);
              astCount -= 2;
              spaceCount++;
          }

          for (int i = 0; i <= n; i++) {
              for (int j = 0; j < spaceCount; j++) {
                  System.out.print(" ");
              }
              for (int k = astCount; k >= 1; k--) {
                  System.out.print("*");
              }
              System.out.print("\n");
              astCount -= 2;
              spaceCount++;
          }
    }

    public void isosTgl(int n) {
          astCount = 1;
          spaceCount = n - 1;
          for (int i = 0; i < n; i ++) {
              for (int j = spaceCount; j > 0; j --) {
                   System.out.print(" ");
              }
              for (int k = 0; k < astCount; k++) {
                    System.out.print("*");
              }
              System.out.print("\n");
              astCount += 2;
              spaceCount--;
          }
    }

    public static void main(String[] args) {
        System.out.println("Print a Diamond");
        Diamond d = new Diamond(10);

        System.out.println("Print a centered triangle");
        d.isosTgl(3);

        System.out.println("Print Diamond with Name");
        Diamond dName = new Diamond(8, "Amanda");
    }
}
