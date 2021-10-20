/*
   Scrooge Playducks - Paul Serbanescu, Yuki Feng, Jaylen Zeng
   APCS Period 7
   HW19: External Audit - Hacking
   10/19/2021
   DISCO: When including a parameter for a method that returns short, you must include the phrase "(short)" before the value.
   QCC: Why must we include (short) when calling a method that returns a short value? Is this a special case, or are there other data types that do this?
*/

public class Teller {
        public static void main(String[] args) {
                BankAccount tom = new BankAccount(); //Initial method tests. Everything works fine so far... 
                tom.setName("tommy");
                tom.setPass("money");
                tom.setPIN((short) 1234);
                tom.setAccNum(123456789);
                tom.setBalance(5);

		//NOTE: Comments placed next to method calls that return unexpected results.
		tom.setPIN((short) 9999); //This should be a valid PIN. The error message does say to input a PIN below 9999, but I don't see the problem with having your pin set to 9999 since it's also 4 digits
		tom.setPIN((short) 1000);
		tom.setPIN((short) 123);


		tom.setAccNum(100000000);
		tom.setAccNum(999999999); //Same problem with setPIN. Why can't my account number be all 9s?
		tom.setAccNum(12498792);
		//tom.setAccNum(012345678); Returns error: "Integer number too large". This account number shouldn't work anyway according to the conditional statement, but it's something to think about.

		tom.withdraw(20); // Nothing is changed as expected because balance didn't have enough money. However, there is no error message.
		System.out.println(tom.toString());

		tom.setAccNum(123456789);
		System.out.println(tom.authenticate(123456789, "money"));
		System.out.println(tom.authenticate(987654321, "moneymoney"));
		System.out.println(tom.authenticate(578403286, "money"));
		System.out.println(tom.authenticate(123456789, "moneymoney"));
        }
}
