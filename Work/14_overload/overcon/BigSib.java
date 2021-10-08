/*
Jaylen Zeng
APCS
HW14 -- Overloaded CONSTRUCTORS
2021-10-07
DISCO:
-Using Overloaded Constructors, you can define multiple objects connected to a member of a class in one concise line of code.
-It's important to also have a default constructor. Otherwise, you will get a BigSib with no defined objects which leads to an error.
QCC:
-Assignment specific: What is the point of separating into 2 directories (Defcon, overcon). Can the code work if the default constructor is in a compeltely different directory?
*/
public class BigSib {
 	String HelloMsg;
	String greeting;
        public BigSib () {
		HelloMsg = "Hi";
		greeting = "guy";
	}
	public BigSib (String msg, String grt) {
		HelloMsg = msg ;
		greeting = grt;
	}

	public void setHelloMsg(String message) {
		HelloMsg = message;

        }
	public String getGrt() {
		return greeting; 
	}
	public String greet(String name) {
                String s;
                s = (HelloMsg +" "+ name);
                return s;
	}
}
