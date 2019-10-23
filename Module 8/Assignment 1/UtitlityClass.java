class BankAccount {
    String accNo = "3746788323";
    double balance = 200.0;
}

class CheckingAccount extends BankAccount {

}

class SavingsAccount extends BankAccount {

}

class COD extends BankAccount {

}

final class UtilityClass {
    public static void main(String[] args) {

        SavingsAccount b = new SavingsAccount();
        System.out.println("I am From Savings Bank, Account no:" + b.accNo);
        System.out.println("I am From Savings Bank, Balance:" + b.balance);
        CheckingAccount a = new CheckingAccount();
        System.out.println("I am From Checking Bank, Account no:" + a.accNo);
        System.out.println("I am From Checking Bank, Balance:" + a.balance);
        COD c = new COD();
        System.out.println("I am From COD Bank, Account no:" + c.accNo);
        System.out.println("I am From COD Bank, Balance:" + c.balance);

    }
}