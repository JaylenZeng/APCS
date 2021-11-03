public class doubleChar {
  public String doubleChar(String str) {
    int x = str.length();
    String ans = "";
    for (int i = 0; i < x ; i++) {
      ans = ans + str.substring(i, i+1) + str.substring(i, i+1);
    }
    return ans;
  }

}
