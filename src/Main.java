import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<AccountUser> users = new ArrayList<>();
        User user = new User(1,"Luan", "5-5-2023","HCM",10);
        User userDefault = new User(2,"David", "5-10-2003","HCM",11);
        User user1 = new User();
        User user2 = new User();
        System.out.println("User1: " + user);
        System.out.println("User2: " + userDefault);

        List<AccountUser> accountUsers = new ArrayList<>();
        AccountUser account1 = new AccountUser();
        AccountUser account2 = new AccountUser();
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

            Scanner scanner = new Scanner(System.in);
            System.out.print("Chose your number: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    // Nhap id
                    System.out.print("nhap id: ");

                    int id = scanner.nextInt();

                    account1.setId(id);
                    //Nhap account number
                    System.out.print("nhap accountNumber: ");

                    String accountNumber = scanner.next();

                    account1.setAccountNumber(accountNumber);
                    // Nhap UserID
                    System.out.print("nhap UserId: ");

                    String userId = scanner.next();

                    account1.setUserId(userId);
                    //Nhap password
                    System.out.print("nhap password: ");

                    int password = scanner.nextInt();

                    account1.setPassword(password);
                    //Nhap balance amount
                    System.out.print("nhap balanceAmount: ");
                    double balanceAmount = scanner.nextDouble();
                    account1.setBalanceAmount(balanceAmount);

//                    account1.addAccount(account1);
                    users.add(account1);
                    System.out.println(account1);

                    // Nhap id
                    System.out.print("nhap id: ");

                    int id1 = scanner.nextInt();

                    account2.setId(id1);
                    //Nhap account number
                    System.out.print("nhap accountNumber: ");

                    String accountNumber1 = scanner.next();

                    account2.setAccountNumber(accountNumber1);
                    // Nhap UserID
                    System.out.print("nhap UserId: ");

                    String userId1 = scanner.next();

                    account2.setUserId(userId1);
                    //Nhap password
                    System.out.print("nhap password: ");

                    int password1 = scanner.nextInt();

                    account2.setPassword(password1);
                    //Nhap balance amount
                    System.out.print("nhap balanceAmount: ");
                    double balanceAmount1 = scanner.nextDouble();
                    account2.setBalanceAmount(balanceAmount1);

//                    user2.addAccount(account2);
                    users.add(account2);
                    System.out.println(account2);

                    break;
                case 2:
                    System.out.print("Nhap id muon doi: ");
                    int inputId = scanner.nextInt();

                    if(inputId == account1.getId()) {
                        System.out.print("Nhap password moi: ");
                        users.get(0).setPassword(scanner.nextInt());
                        break;
                    } else if ((inputId == account2.getId())) {
                        System.out.print("Nhap password moi: ");
                        users.get(1).setPassword(scanner.nextInt());
                        break;
                    } else
                    System.out.println("Khong co id trong list");
                    break;
                case 3:
                    System.out.print("Chon account muon xoa: ");
                    int inputRemove = scanner.nextInt();
                    switch (inputRemove) {
                        case 1:
                            users.remove(account1);
                            for(AccountUser userList: users) {
                                System.out.println(userList);
                            }
                            break;
                        case 2:
                            users.remove(account2);
                            for(AccountUser userList: users) {
                                System.out.println(userList);
                            }
                            break;
                        default:
                            System.out.println("Khong co trong list");
                    }

                    break;
                case 4:
                    for(AccountUser userList: users) {
                        System.out.println(userList);
                    }
                    break;
                case 5:
                    System.out.print("Chon account: ");
                    int input1 = scanner.nextInt();
                    System.out.print("Nhap so tien: ");
                    double depositMoney = scanner.nextDouble();
                    switch (input1) {
                        case 1:
                            double deposit = depositMoney + account1.getBalanceAmount();
                            System.out.println("The deposit money is: " + deposit);
                            account1.setBalanceAmount(deposit);
                            break;
                        case 2:
                            double deposit1 = depositMoney + account2.getBalanceAmount();
                            System.out.println("The deposit money is: " + deposit1);
                            account2.setBalanceAmount(deposit1);
                            break;
                        default:
                    }
                    break;
                case 6:
                    System.out.print("Chon account: ");
                    int input2 = scanner.nextInt();
                    System.out.print("Nhap so tien: ");
                    double withDrawMoney = scanner.nextDouble();
                    switch (input2) {
                        case 1:
                            double withDraw = account1.getBalanceAmount() - withDrawMoney ;
                            System.out.println("The deposit money is: " + withDraw);
                            account1.setBalanceAmount(withDraw);
                            break;
                        case 2:
                            double withDraw1 = account2.getBalanceAmount() - withDrawMoney ;
                            System.out.println("The deposit money is: " + withDraw1);
                            account2.setBalanceAmount(withDraw1);
                            break;
                        default:
                    }
                    break;
                default:
                    checkWhile = false;
                    break;
            }
        }

    }
}

