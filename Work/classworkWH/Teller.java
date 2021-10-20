public class Teller {
	public static void main(String[] args) {
		BankAccount tom = new BankAccount("tom", "moneymoney", 2416, 234689175, 0);
		tom.printInfo();
		tom.deposit(2);
		tom.withdraw(1);
		/*tom.setName("tommy");
		tom.setPass("money");
		tom.setPIN(1234);
		tom.setAccNum(123456789);
		tom.setBalance(5);
		tom.printInfo();
		The above methods don't work because they are private, thus they cannot be accessed outside the source class file. */
		tom.withdraw(5); //we'll try to withdraw more money than what is in the bank account. Doing this will return a negative bank balance. 
		BankAccount wrongpin = new BankAccount("george", "dinero", 317, 123456789, 0); //We'll try to create a BankAccount with a pin that isn't 4 digits.
		wrongpin.printInfo();
		//This sets the pin to the 3 digit number that we gave. This shouldn't happen. Instead, it should automiatically be set to 9999 and alert the user that the inputted pin was invalid. 
		BankAccount wrongAccNum = new BankAccount("fool", "poop", 1234, 12345678, 0); //try to set acc num not 9 digits
		wrongAccNum.printInfo();
		// this sets acc num to inputted one which shouldnt happen. it should instead be set to 999999999. user should be alerted on invalid acc number.
		
	}
}

