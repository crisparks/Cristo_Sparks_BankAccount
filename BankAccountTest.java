public class BankAccountTest extends BankAccount
{
     public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        
        System.out.println("The bank account number for this account is : " + account1.getAccountNumber());
        account1.getCheckingBalance();
        account1.getSavingsBalance();
        account1.depositChecking(10000);
        account1.depositSavings(2000);
        account1.withdrawalChecking(250);
        System.out.println(account1.getCheckingBalance());
        account1.withdrawalSavings(100);
        System.out.println(account1.getSavingsBalance());
        account1.total();
        System.out.println("Total : $" + account1.total());
        
   }
}
