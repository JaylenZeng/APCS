/*
   Jaylen Zeng
   APCS
   HW24 - Get It While You Can / Working with While loops
   2021-10-25
   DISCO:
  * While loops work the same as they do in Python. They take a boolean and loop the code inside until that boolean is no longer true.
  * You can assign multiple variables a data type all in one line of code. Separate your instance variables with a comma.
   QCC:
  * What happens when your loop goes on forever? How do you kill the program when it happens?
   MODS:
  *Modified constructors so they contain everything needed. Ex: this(), assignValue, etc.
  *Changed assignValue method to include .equals
  *Changed reset method so it also resets counters (flip,tails,heads)
  *Changed equals method so it actually uses built-in .equals
*/
public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine.toString());
      System.out.println("yours: " + yours.toString());
      System.out.println("wayne: " + wayne.toString());
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      //HW-24
      int heeds, x, count;
      x = 10;
      heeds = 0;
      count = 0;

      Coin timmy = new Coin("penny");
      while (heeds < x) {
      	if (timmy.flip() == "heads") {
		heeds += 1;
	}
	count += 1;
      }

      System.out.println(heeds);
      System.out.println(count);

      Coin john = new Coin("nickel");
      int y, meetch, count2;
      y = 10;
      meetch = 0;
      count2 = 0;
      while (meetch <  y) {
      	if (john.flip() == timmy.flip()) {
		meetch += 1;
	}
	count2 += 1;
      }

      System.out.println(meetch);
      System.out.println(count2);

      int meetch2 = 0;
      int z = 65536;
      int count3 = 0;
      boolean req = true;

      while (req == true) {
      	if (john.flip() == timmy.flip()) {
		meetch2 += 1;
	}
	count3 += 1;

	if (meetch >= z && meetch % 2005 == 0) {
		req = false;
	}
}

      System.out.println(meetch2);
      System.out.println(count2);

    /*===================TOP==========================
      ====================BOTTOM======================*/

  }//end main()

}//end class
