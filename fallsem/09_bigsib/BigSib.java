public class BigSib {
	static void greet(String name) {
		System.out.println("How's it going"+ name+"? Good to see you again!");
	}

	public static void main(String[] args) {
		BigSib.greet("Raymond");
		BigSib.greet("Serena");
		BigSib.greet("Jayden");
	}
}

/*
DISCOVERIES:
-The stuff after "." is the method. For example, in BigSib.greet, "greet" is the method we are calling in the class
"BigSib". Everything else pretty much works the same. Also, I just recently discovered that the name of the class
and the name of the file have to be exactly the same. Otherwise, the program does not work. I'm surprised I didn't
figure that out earlier...
UNRESOLVED QUESTIONS:
-What does static mean?
* */


