//Return the number of times that the string "hi" appears anywhere in the given string.
public class countHi {
  public static int countHi(String str) {
      int x = str.length();
      int count = 0;
      for (int i = 0; i < x-1; i++) {
        if (str.substring(i, i+2) == "hi" && (i + 1) <= x) {
          count++ ;
        }
      }
      return count;
    }
  public static void main(String[] args) {
    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("hihi"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hiHihi"));
    System.out.println(countHi(""));
    System.out.println(countHi("h"));
    System.out.println(countHi("hi"));
    System.out.println(countHi("Hi is no HI on ahI"));
    System.out.println(countHi("hiho not HOHIhi"));
  }
