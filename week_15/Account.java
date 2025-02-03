package week_15;

import java.util.UUID;

public class Account {
    protected String accountNumber;
    protected User accountOwner;
    protected double balance;
    protected String pin;

    public Account(User accountOwner, String pin){
        this.accountNumber = UUID.randomUUID().toString();
        this.accountOwner = accountOwner;
        this.balance = 0.0;
        this.pin = pin;
    }
}
