import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User  {
    private int id;
    private String name;
    private String birthday;
    private String address;
    private int idNumber;

    public User() {
//        accountUsers = new ArrayList <AccountUser>();
    }
    public User(int id, String name, String birthday, String address,int idNumber){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.idNumber= idNumber;
    }
    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return String.format("Id: %s, name: %s, birthday: %s, address: %s",id, name,birthday,address);
    }
}
