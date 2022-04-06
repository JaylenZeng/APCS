public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");
    BigSib spaceboy = new BigSib();
    spaceboy.setHelloMsg("Salutations");
    BigSib timmy = new BigSib();
    timmy.setHelloMsg("Hey ya");
    BigSib boy = new BigSib();
    boy.setHelloMsg("Sup");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = spaceboy.greet("Dr. Spaceman");
    System.out.println(greeting);
    greeting = timmy.greet("Kong Fooey");
    System.out.println(greeting);
    greeting = boy.greet("mom");
    System.out.println(greeting);



  } //end main()
} //end Greet
