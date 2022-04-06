/*
Jaylen Zeng
APCS
HW10 -- BigSib Objects Pt 2
2021-10-04

DISCOVERIES:
-Methods do not have to be in the same .java file in order to use each other. I didn't know this while I was doing
HW#9 so I had both of them in the BigSib.java file and the Greet.java file was just the old version. This time I
separated the two classes and methods and the code works fine!
-When creating a method that returns a value, you have to specify what value it is. For instance, I had the BigSib
method return a string. Therefore, I had to write "String" before the name of my method. In the case that you
don't want the method to return anything, you simply write "void" as shown below in class Greet. The plan for this
assignment was to print out the returned value from BigSib.greet.
*/
public class Greet {
	public static void main(String[] args) {
		System.out.println( BigSib.greet(" Crosby") );
		System.out.println( BigSib.greet(" Stills") );
		System.out.println( BigSib.greet(" Nash") );
	}
}
