package Atmpackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingbalance =500;
	private double savingbalance =1000 ;
	
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0,00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
		
	 }

	public int getCustomerNumber() {
		return customerNumber;

	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return customerNumber;

	}
	
	public int getPinNumber() {
		return pinNumber;

	}
	public double getCheckingBalance() {
		return checkingbalance;

		}
	
	public double getSavingBalance() {
		return savingbalance;

	}

 
	public double calCheckinWithDraw(double amount) {
		checkingbalance = (checkingbalance- amount);
		return checkingbalance;
	}
	public double calSavingWithDraw(double amount) {
		savingbalance = (savingbalance - amount);
		return savingbalance;
	}
	
	public double calCheckingDeposit(double amount) {
		checkingbalance = (checkingbalance + amount);
		return checkingbalance;
	}
	
	public double calSavingDeposit(double amount) {
		savingbalance = (savingbalance + amount);
		return savingbalance;
	}
	
	
	public void getCheckingWithDrawInput(){
		System.out.println("Checking Account Balance" + moneyFormat.format(checkingbalance));
		System.out.println("Amount you want to withdraw from checking accounts");
		double amount = input.nextDouble();
		
		if ((checkingbalance - amount)>=0) {
			calCheckinWithDraw(amount);
			System.out.print("New Checking Account Balance" + moneyFormat.format(checkingbalance));
		}
		else {
			System.out.println("Balance cannot be negative");
		}
			
		}
		
	 public void getSavingWithDrawInput(){
		 System.out.println("Saving Account Balance" + moneyFormat.format(savingbalance));
		 System.out.println("Amount you want to withdraw from Savings");
		 double amount = input.nextDouble();
			
		 if ((savingbalance - amount)>=0) {
			 calSavingWithDraw(amount);
			 System.out.print("New Saving Account Balance" + moneyFormat.format(savingbalance));
			}
		 else {
				System.out.println("Balance cannot be negative");
			}
				
			}
	 
	 public void getCheckingDepositInput(){
			System.out.println("Checking Account Balance" + moneyFormat.format(checkingbalance));
			System.out.println("Amount you want to deposite from checking accounts");
			double amount = input.nextDouble();
			
			if ((checkingbalance + amount)>=0) {
				calCheckingDeposit(amount);
				System.out.print("New Checking Account Balance" + moneyFormat.format(checkingbalance));
			}
			else {
				System.out.println("Balance cannot be negative");
			}
				
			}
		 
	 
	 
	 
	 
	 public void getSavingDepositInput(){
			System.out.println("Checking Account Balance" + moneyFormat.format(savingbalance));
			System.out.println("Amount you want to deposite from checking accounts");
			double amount = input.nextDouble();
			
			if ((savingbalance - amount)>=0) {
				calSavingDeposit(amount);
				System.out.print("New Checking Account Balance" + moneyFormat.format(savingbalance));
			}
			else {
				System.out.println("Balance cannot be negative");
			}
	
			
			}
}
	


	
