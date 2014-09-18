
/*
 * Matthew Schlogel
 * PS3
 */

import java.util.Date;

public class Account {

	//Data types
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date date;
	
	
	//Default Account ___________________________________________________
	
	public Account(){
		
	}
	
	public double Account(double balance){
		this.balance = balance;
		return this.balance;
	}
	
	//Constructor for account with id, and balance, default aIR__________
	
	public Account(int id, double balance){
		id = this.id;
		balance = this.balance;
		this.annualInterestRate = 0;
		this.date = new Date(14,8,17);
	}
		
	//Constructor for account with id, balance, and annualInterestRate___
	
	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.date = new Date(14,8,17);
	}
	
	//Accessors for id, balance, and annualInterestRate__________________
	
	public int getid(){
		return this.id;
	}
	
	public double getbalance(){
		return this.balance;
	}
	public double annualInterestRate(){
		return this.annualInterestRate;
	}
	
	//Mutators ___________________________________________________________
	
	public int changeid(int newid){
		this.id = newid;
		return this.id;
	}
	public double changebalance(double newbalance){
		this.balance = newbalance;
		return this.balance;
	}
	public double changeannualInterestRate(double newannualInterestRate){
		this.annualInterestRate = newannualInterestRate;
		return this.annualInterestRate;
	}
	//Accessor for date created__________________________________________
	
	public Date dateCreated(){
		return this.date;
	}
	
	//A method named getMonthlyInterestRate() that returns that__________
	
	public double getMonthlyInterestRate(){
		return (this.annualInterestRate/12);
	}
	
	//A method named withdraw that withdraws
	
	public double withdraw(double amount){
		if (amount > this.balance){
			this.balance = 0;
			return this.balance;
		}
		else{
			this.balance = this.balance - amount;
			return this.balance;
		}
	}
	
	//A method named deposit that deposits
	
	public double deposit(double amount){
		this.balance = this.balance + amount;
		return this.balance;
	}
	
}
