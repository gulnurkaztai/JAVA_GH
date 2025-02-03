package week_15;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private String userName;
    private String pin;
    private List<Account> accounts;

    public User(String userName, String pin){
        this.userId = UUID.randomUUID().toString();
        this.userName = userName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }
}
