
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 BankAccount acc1 = new BankAccount();
	     BankAccount acc2 = new BankAccount();
	     BankAccount acc3 = new BankAccount();
	     
	     System.out.println(acc3.getAccountNo());
	     System.out.println(BankAccount.counter);
	     
	     
	     acc1.depositetoSaving(600.5);
	     acc1.depositetoChecking(5.2);
	     
	     System.out.println(acc1.getSavingBalance());
	     System.out.println(acc1.getCheckingBalance());
	     


	     
	     
		
		
		
		

	}

}
