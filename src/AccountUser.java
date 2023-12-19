import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AccountUser extends User {
    private int id;
    private String accountNumber;
    private  String userId;
    private String password;
    private double balanceAmount;
    private Type type;
    List<AccountUser> accountUsers = new ArrayList<>();
    public AccountUser() {

    }
    public AccountUser(int id, String accountNumber,String userId,String password, double balanceAmount) {
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
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return String.format("Id: %s, accountNumber: %s, userId: %s, password: %s, balanceAmount: %f",id, accountNumber, userId, password,balanceAmount);
    }

}
