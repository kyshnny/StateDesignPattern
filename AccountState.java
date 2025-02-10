public interface AccountState {
    void deposit(Account myAccount, double amount);
    void withdraw(Account myAccount, double amount);
    void activate(Account myAccount);
    void suspend(Account myAccount);
    void close(Account myAccount);
}
