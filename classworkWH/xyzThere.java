/*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.)
So "xxyz" counts but "x.xyz" does not. */
public class xyzThere{
  public boolean xyzThere(String str) {
      boolean there = false;
      for (int i = 0; i < str.length()-2; i++) {
        if (i != 0) {
          if (!str.substring(i-1, i).equals(".")) {
            if (str.substring(i, i+3).equals("xyz")) {
              there = true;
            }
          }
        }
        else {
          if (str.substring(i, i+3).equals("xyz")) {
            there = true;
          }
        }


      }
      return there;
    }

  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz"));
    System.out.println(xyzThere("abc.xyz"));
    System.out.println(xyzThere("xyz.abc"));
    System.out.println(xyzThere("abcxy"));
    System.out.println(xyzThere("xyz"));
    System.out.println(xyzThere("xy"));
    System.out.println(xyzThere("x"));
    System.out.println(xyzThere(""));
    System.out.println(xyzThere("abc.xyzxyz"));
  }

}
