import java.util.Random;

public class BankAccount {


	public static int counter = 0;
    public static int totalChecking = 0;
    public static int totalSaving = 0;

   
//#1
    private String accountNo;
    public double checkingBalance;
    public double savingBalance;


    public BankAccount(){
        counter++;
        accountNo = generateTenDigits();
    }
     
    public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}


	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	private static String  generateTenDigits() {
    	
    	String placeholder = "";
    	Random re = new Random();
    	
    	for (int i = 0 ; i< 10 ; i++) {
    		placeholder += re.nextInt(10);
    	}
    	
    	return placeholder;
    }
	
	
	
public void depositetoSaving(double amount) {
		
		this.savingBalance += amount;
//		setSavingBalance(getSavingBalance()+amount);
		totalSaving+=amount;
	}
	
public void depositetoChecking(double amount) {
		
		this.checkingBalance += amount;
		totalChecking+=amount;
		
	}
public void withdrawFromSaving (double withdrawl) {
	
	if (savingBalance < withdrawl) {
		this.savingBalance -= withdrawl;
	}
	else {
		System.out.println("The account is in shortage");
	}
}

public void totalMoneyDisplay() {
	
	System.out.println("Total checking money amount" + totalChecking);
	System.out.println("Total saving money amount" + totalSaving);
}


    
    
    
    
	
}
