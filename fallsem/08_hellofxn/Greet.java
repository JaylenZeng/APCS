public class Greet {
	static void greetmethod(String name) {
		System.out.println("How's it going"+name+"? Good to see you again!");
	}

	public static void main(String[] args) {
		greetmethod(" REDACTED");
		greetmethod(" John Adams");
		greetmethod(" Billy");
	}
}




