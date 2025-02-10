public class SuspendedState implements AccountState{
    
    @Override
    public void deposit(Account myAccount, double amount) {
        System.out.println("You cannot deposit on a suspended account!");
    }

    @Override
    public void withdraw(Account myAccount, double amount) {
        System.out.println("You cannot withdraw on a suspended account!");
    }

    @Override
    public void activate(Account myAccount) {
        myAccount.setState(new ActivateState());
        System.out.println("Account is activated.");
    }

    @Override
    public void suspend(Account myAccount) {
        System.out.println("Account is already suspended.");
    }

    @Override
    public void close(Account myAccount) {
        myAccount.setState(new ClosedState());
        System.out.println("Account is closed.");
    }
    
}
