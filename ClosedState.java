public class ClosedState implements AccountState{
    
    @Override
    public void deposit(Account myAccount, double amount) {
        System.out.println("You cannot deposit on a closed account!");
    }

    @Override
    public void withdraw(Account myAccount, double amount) {
        System.out.println("You cannot withdraw on a closed account!");
    }

    @Override
    public void activate(Account myAccount) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void suspend(Account myAccount) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void close(Account myAccount) {
        System.out.println("Account is closed.");
    }
    
}
