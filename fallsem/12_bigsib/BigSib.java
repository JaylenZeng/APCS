/*
Jaylen Zeng
APCS
HW12 -- BigSib Pt 3: Preset Greetings
2021-10-05
DISCO:
-Making multiple methods for one class is actually pretty simple. Just make sure all of the code is in the corresponding
swirly braces. Otherwise, you get an error because that method is outside the class. Of course, all usual method
making syntax rules apply.
-You can assign variable names a class. In this assignment for example, we assigned "richard" to the BigSib class. We
can assign a variable a class by using a command with this structure: CLASSNAME variablename = new CLASSNAME();. This
will designate "richard" as apart of the BigSib class.
-Once a variable becomes apart of a class, it can utilize all of its methods. Bringing back richard for a moment,
richard.greet("freshman") will run the greet method in class BigSib. We can even provide additional information
required such as the string in the parenthesis.
QCC:
-What's the purpose of the parenthesis after BigSib when assigning a variable a class?
More specifically: ... = new BigSib() <--- These parenthesis
For now, I'm assuming we can assign more variables using this?
-What does "static" mean and what makes a variable static? In addition, what is a static context?
*/


public class BigSib {
        String HelloMsg;
	system.out.ln(HelloMsg);
	public void setHelloMsg(String message) {
		HelloMsg = message;

        }


	public String greet(String name) {
                String s;
                s = (HelloMsg +" "+ name);
                return s;
	}
}
