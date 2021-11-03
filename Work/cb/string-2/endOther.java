//Given two strings, return true if either of the strings appear at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

public class endOther {
  public boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    int lenA = a.length();
    int lenB = b.length();
    if (lenA > lenB) {
      return ((a.substring(lenA-lenB, lenA)).equals(b);
    }
    else {
      return ((b.substring(lenB-lenA, lenB)).equals(a));
    }

  }
  public static void main(String[] args) {
    System.out.println(endOther("Hiabc", "abc"));
    System.out.println(endOther("AbC", "HiaBc"));
    System.out.println(endOther("abc", "abXabc"));
    System.out.println(endOther("Hiabc", "abcd"));
}
