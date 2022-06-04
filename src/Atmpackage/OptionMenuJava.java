package Atmpackage;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenuJava extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0,00");
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	 
	public void getlogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(123456789, 1234);
				data.put(123456780, 1230);
			
				
				System.out.println("Welcome to ATM");
				System.out.println("Enter your Customer number");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your PIN number");
				setPinNumber(menuInput.nextInt());
				
				
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("\n"+ "Invalid Character(s). OnlyNumbers." + "\n");
				x=2;
				
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if (data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}		
			else
				System.out.println("\n"+ "wrong customer number");
			}while(x==1);
		}
	public void getAccountType() {
		// TODO Auto-generated method stub
		System.out.println("Select the account you want to access");
		System.out.println("Type 1 for- Checking accounts");
		System.out.println("Type 2 for- Saving accounts");
		System.out.println("Type 3 for- Exit");
		
		int selection= menuInput.nextInt();
		switch (selection) {
		case 1: 
			getChecking();
			break;
		case 2: 
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this service");
			break;
			
		default:
			System.out.println("\n"+ "Invalid choice"+ "\n");
			getAccountType();
		}
	}

	public void getChecking() {
		// TODO Auto-generated method stub
		
		System.out.println("Checking accounts");
		System.out.println("Type1 - View balance");
		System.out.println("Type2 - Withdraw Funds");
		System.out.println("Type3 - Deposite Funds");
		System.out.println("Type4 - Exit");
		System.out.println("Choice : ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1: 
			System.out.println("Checking Account balance"+ moneyFormat.format(getCheckingBalance()) + "\n");
			getAccountType();
			break;
			
		case 2: 
			getCheckingWithDrawInput();
			//getSavingWithDrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this service ATM ");
			break;
			
		default:
			System.out.println("\n"+ "Invalid choice"+ "\n");
			getAccountType();
		}
		
		
	}
	
	public void getSaving() {
		// TODO Auto-generated method stub
		
		System.out.println("Saving accounts");
		System.out.println("Type1 - View balance");
		System.out.println("Type2 - Withdraw Funds");
		System.out.println("Type3 - Deposite Funds");
		System.out.println("Type4 - Exit");
		System.out.println("Choice : ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1: 
			System.out.println("Saving Account balance"+ moneyFormat.format(getSavingBalance()) + "\n");
			getAccountType();
			break;
			
		case 2: 
			//getCheckingWithDrawInput();
			getSavingWithDrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this service ATM ");
			break;
			
		default:
			System.out.println("\n"+ "Invalid choice"+ "\n");
			getAccountType();
		}
		
		
}
}
	
	