import java.util.Date;

class BankAccount {
    long accountNumber;
    double balance;
}

class CheckingAccount extends BankAccount {
    double limit;
    CheckingAccount(double limit){
        this.limit = limit;
    }
    public void checkLimit(){
        if(balance<limit){
            System.out.println("You are not exceeding limit");
        }else{
            System.out.println("You are exceeding limit");
        }
    }
}

class SavingsAccount extends BankAccount {
    int transfers = 0;
    int maxTransfers;
    SavingsAccount(int maxTransfers){
        this.maxTransfers = maxTransfers;
    }
    public void makeTransfer(){
        if(transfers<maxTransfers){
            transfers += 1;
            System.out.println("Transfer Successful");
        }else{
            System.out.println("You have exceeded your transfers");
        }
    }

}

class CertificateOfDeposit extends BankAccount {
    Date expiry;
    CertificateOfDeposit(Date expiry){
        this.expiry = expiry;
    }
    public void checkExpiry(Date presentDate){
        if(presentDate.after(expiry) == true){
            System.out.println("You can withdraw money");
        }else{
            System.out.println("You cannot withdraw money before expiry date");
        }
    }
}

class BankManager {
    public static void main(String[] args) {
        CheckingAccount objCheckingAccount = new CheckingAccount(5000);
        objCheckingAccount.balance = 2000;
        objCheckingAccount.checkLimit();
        objCheckingAccount.balance = 6000;
        objCheckingAccount.checkLimit();
        SavingsAccount objSavingsAccount = new SavingsAccount(3);
        objSavingsAccount.makeTransfer();
        objSavingsAccount.makeTransfer();
        objSavingsAccount.makeTransfer();
        objSavingsAccount.makeTransfer();
        Date expiry = new Date(2019, 10, 14);
        CertificateOfDeposit objCertificateOfDeposit = new CertificateOfDeposit(expiry);
        Date presentDate = new Date(2018, 10, 18);
        objCertificateOfDeposit.checkExpiry(presentDate);
        presentDate = new Date(2019, 11, 25);
        objCertificateOfDeposit.checkExpiry(presentDate);       
    }
}