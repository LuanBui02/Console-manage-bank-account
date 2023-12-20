import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        AccountServiceImpl service = new AccountServiceImpl();

        User user1 = new User(1,"Luan", "5-5-2023","HCM",10);
        User user2 = new User(2,"David", "5-10-2003","HCM",11);

        System.out.println("User1: " + user1);
        System.out.println("User2: " + user2);
        List<Type> typeList = new ArrayList<>();
        Type type1 = new Type();
        type1.setId(1);
        type1.setRole("personal");

        Type type2 = new Type();
        type2.setId(2);
        type2.setRole("business");

        boolean checkWhile = true;

        while(checkWhile) {

            System.out.println("Press 1 is add new account");
            System.out.println("Press 2 is update account");
            System.out.println("Press 3 is remove account");
            System.out.println("Press 4 is Show all account");
            System.out.println("Press 5 is Deposit money");
            System.out.println("Press 6 is Withdraw money");
            System.out.println("Press 7 is find account by name");
            System.out.println("Press 8 is find account by birthday");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Chose your number: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    service.addAccount();
                    break;
                case 2:
                    service.updateAccount();
                    break;
                case 3:
                    service.removeAccount();
                    break;
                case 4:
                    service.showAccount();
                    break;
                case 5:
                    service.depositMoney();
                    break;
                case 6:
                    service.withdrawMoney();
                    break;
                case 7:
                    service.findAccountByName();
                    break;
                case 8:
                    service.findAccountByBirthday();
                    break;

                default:
                    checkWhile = false;
                    break;
            }
        }

    }
}

