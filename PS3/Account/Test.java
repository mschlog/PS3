
public class Test {

//TESTING ACCOUNT_______________________________________________________________
	
	public static void main(String[] args){
		
		Account Test = new Account(1122,20000,4.5);
		
		Test.withdraw(2500);
		
		Test.deposit(3000);
		
		System.out.println("Your Balance Is: " + Test.getbalance());
		System.out.println("Your Monthly Interest Rate Is: " + Test.getMonthlyInterestRate());
		System.out.println("The Account Was Created On: " + Test.dateCreated());
	}
}
