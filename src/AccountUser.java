import java.util.ArrayList;
import java.util.List;

public class AccountUser {
    private int id;
    private String accountNumber;
    private  String userId;
    private int password;
    private double balanceAmount;
    private Type type;
    List<AccountUser> accountUsers = new ArrayList<>();
    public AccountUser() {

    }
    public AccountUser(int id, String accountNumber,String userId,int password, double balanceAmount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.password = password;
        this.balanceAmount = balanceAmount;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void addAccount(AccountUser account) {
        accountUsers.add(account);
    }
    public boolean removeAccount(AccountUser account) {
        accountUsers.remove(account);
        return true;
    }

    @Override
    public String toString() {
        return String.format("Id: %s, accountNumber: %s, userId: %s, password: %d, balanceAmount: %f",id, accountNumber, userId, password,balanceAmount);
    }

}
