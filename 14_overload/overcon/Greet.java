public class Greet {
  public static void main( String[] args ) {

	BigSib richard = new BigSib("Word up", "freshman");
	System.out.println(richard.greet(richard.getGrt()));
	BigSib grizz = new BigSib("Hey ya", "Kong Foeey");
	System.out.println(grizz.greet(grizz.getGrt()));
	BigSib dotCom = new BigSib("Sup", "mom");
	System.out.println(dotCom.greet(dotCom.getGrt()));
	BigSib tracy = new BigSib("Salutations", "Dr.Spaceman");
	System.out.println(tracy.greet(tracy.getGrt()));
	BigSib deflt = new BigSib();
	System.out.println(deflt.greet(deflt.getGrt()));

	}
}

