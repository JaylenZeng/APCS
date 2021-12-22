public class Driver {
  public static void main(String[] args) {
    //compareTo Test Cases
    System.out.println("Testing compareTo");
    Rational stillDavid = new Rational(5, 8);
    Rational jaylen = new Rational(10,16);
    Rational orion = new Rational(7,8);
    String freshman = new String("Thinkeren");
    System.out.println(stillDavid.compareTo(jaylen)); //should return 0;
    System.out.println(jaylen.compareTo(orion));
    System.out.println(orion.compareTo(stillDavid));
    System.out.println(orion.compareTo(freshman));


    //.equals test cases
  }
}
