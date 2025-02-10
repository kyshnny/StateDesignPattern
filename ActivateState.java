public class ActivateState implements AccountState{
    
    @Override
    public void deposit(Account myAccount, double amount){
        myAccount.setBalance(myAccount.getBalance() + amount);
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance " + myAccount.getBalance());
        System.out.println();
    }
    
    @Override
    public void withdraw(Account myAccount, double amount){
        if (myAccount.getBalance() >= amount) {
            myAccount.setBalance(myAccount.getBalance() - amount);
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + myAccount.getBalance());
            System.out.println();
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void activate(Account myAccount) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account myAccount) {
        myAccount.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account myAccount) {
        myAccount.setState(new ClosedState());
        System.out.println("Account is closed.");
    }
    
}
