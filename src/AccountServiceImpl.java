import org.w3c.dom.xpath.XPathResult;

import java.util.*;

public class AccountServiceImpl implements AccountService {
    List<User> users = new ArrayList<>();
    User user1 = new User(1, "Luan", "5-5-2023", "HCM", 10);

    User user2 = new User(2, "David", "5-10-2003", "HCM", 11);

    List<AccountUser> accountUsers = new ArrayList<>();


    Scanner scanner = new Scanner(System.in);

    @Override
    public void addAccount() {
        AccountUser account = new AccountUser();

        System.out.print(Constant.enterId);
        int id = 0;
        boolean checkId = true;


        while (checkId) {
            boolean checkFor = false;
            id = scanner.nextInt();

            if (accountUsers.isEmpty()) {
                break;
            }
            for (AccountUser check : accountUsers) {
                account.setId(id);
                if (check.getId() == account.getId()) {
                    System.out.print(Constant.enterIdAgain);
                    checkFor = true;
                    break;
                }
            }
            if (!checkFor) {
                checkId = false;
            }

        }
        account.setId(id);
        System.out.print(Constant.enterAccountNumber);

        String accountNumber = scanner.next();

        account.setAccountNumber(accountNumber);
        // Nhap UserID
        System.out.print(Constant.enterUserId);

        String userId = scanner.next();

        account.setUserId(userId);
        //Nhap password
        scanner.nextLine();

        System.out.print(Constant.enterPassword);
        String password = "";

        boolean checkPassword = true;

        while (checkPassword) {
            password = scanner.nextLine();
            boolean checkCh = false;
            if (password.trim().isEmpty()) {
                System.out.println(Constant.enterPasswordAgain);
                checkCh = true;

            }
            for (char ch : password.toCharArray()) {
                if (ch == ' ') {
                    System.out.println(Constant.enterPasswordAgain);
                    checkCh = true;
                }
            }
            if (!checkCh) {
                checkPassword = false;
            }


        }
        account.setPassword(password);

        //Nhap balance amount
        System.out.print(Constant.enterBalance);
        double balanceAmount;

        while (!scanner.hasNextDouble()) {
            System.out.println(Constant.getEnterBalance);
            scanner.next();
        }
        balanceAmount = scanner.nextDouble();
        account.setBalanceAmount(balanceAmount);

        accountUsers.add(account);

        System.out.println(account);
    }


    @Override
    public void updateAccount() {
        if (accountUsers.isEmpty()) {
            System.out.println(Constant.emptyList);
        } else {
            System.out.print(Constant.choseId);
            int inputId = scanner.nextInt();
            boolean checkIndex = false;
            for (int i = 0; i < accountUsers.size(); i++) {
                if (inputId == accountUsers.get(i).getId()) {
                    System.out.print(Constant.enterAccountNumber);

                    String accountNumber = scanner.next();

                    accountUsers.get(i).setAccountNumber(accountNumber);
                    // Nhap UserID
                    System.out.print(Constant.enterUserId);

                    String userId = scanner.next();

                    accountUsers.get(i).setUserId(userId);
                    //Nhap password
                    scanner.nextLine();
                    System.out.print(Constant.enterPassword);
                    String password = "";

                    boolean checkPassword = true;

                    while (checkPassword) {
                        password = scanner.nextLine();
                        boolean checkCh = false;
                        if (password.trim().isEmpty()) {
                            System.out.println(Constant.enterPasswordAgain);
                            checkCh = true;

                        }
                        for (char ch : password.toCharArray()) {
                            if (ch == ' ') {
                                System.out.println(Constant.enterPasswordAgain);
                                checkCh = true;
                            }
                        }
                        if (!checkCh) {
                            checkPassword = false;
                        }


                    }
                    accountUsers.get(i).setPassword(password);
                    //Nhap balance amount
                    System.out.print(Constant.enterBalance);
                    double balanceAmount;

                    while (!scanner.hasNextDouble()) {
                        System.out.println(Constant.getEnterBalance);
                        scanner.next();
                    }
                    balanceAmount = scanner.nextDouble();
                    accountUsers.get(i).setBalanceAmount(balanceAmount);
                    users.add(accountUsers.get(i));
                    System.out.println(users);
                    checkIndex = true;
                    break;
                }
            }
            if (!checkIndex) {
                System.out.println(Constant.noList);
            }
        }
    }

    @Override
    public void removeAccount() {
        if (accountUsers.isEmpty()) {
            System.out.println(Constant.emptyList);
        } else {
            System.out.print(Constant.choseId);

            int inputRemove = scanner.nextInt();

            boolean checkLoop = false;
            for (int i = 0; i < accountUsers.size(); i++) {

                if (inputRemove == accountUsers.get(i).getId()) {
                    accountUsers.remove(accountUsers.get(i));
                    checkLoop = true;
                    break;
                }

            }
            if (!checkLoop) {
                System.out.println(Constant.noList);
            }
        }
    }


    @Override
    public void showAccount() {
        for (AccountUser userList : accountUsers) {
            System.out.println(userList);
        }
    }

    @Override
    public void depositMoney() {
        if (accountUsers.isEmpty()) {
            System.out.println(Constant.emptyList);

        } else {
            System.out.print(Constant.choseId);
            int input1 = scanner.nextInt();

            boolean checkLoop = false;
            for (int i = 0; i < accountUsers.size(); i++) {

                if (input1 == accountUsers.get(i).getId()) {
                    System.out.println(Constant.enterDeposit);
                    double depositMoney = scanner.nextDouble();
                    double deposit = depositMoney + accountUsers.get(i).getBalanceAmount();
                    System.out.println(Constant.depositPrint + deposit);
                    accountUsers.get(i).setBalanceAmount(deposit);
                    checkLoop = true;

                    break;
                }
            }
            if (!checkLoop) {
                System.out.println(Constant.noList);

            }
        }


    }


    @Override
    public void withdrawMoney() {
        if(accountUsers.isEmpty()) {
            System.out.println(Constant.emptyList);
        } else {
            System.out.print(Constant.choseId);
            int input1 = scanner.nextInt();
            boolean checkWithDraw = true;
            while (checkWithDraw) {
                boolean checkLoop = false;
                boolean checkOut = false;

                for (int i = 0; i < accountUsers.size(); i++) {

                        if (input1 == accountUsers.get(i).getId()) {

                                System.out.println(Constant.enterWithDraw);
                                double withDrawMoney = scanner.nextDouble();
                                    if(withDrawMoney <= accountUsers.get(i).getBalanceAmount()) {
                                        double withDraw = accountUsers.get(i).getBalanceAmount() - withDrawMoney;
                                        System.out.println(Constant.withDrawPrint + withDraw);
                                        accountUsers.get(i).setBalanceAmount(withDraw);
                                        checkLoop = true;
                                        checkOut = false;

                                    } else {
                                        System.out.println(Constant.conditionWithDraw);
                                        checkLoop = true;
                                        checkOut = true;

                                }
                    }

                    }
                if(!checkLoop) {
                    System.out.println(Constant.noList);
                    break;
                }
                if (!checkOut) {
                    checkWithDraw = false;
                    }   if(!checkLoop) {
                    checkWithDraw = false;
                }
            }
        }
    }


    @Override
    public void findAccountByName() {
        users.add(user1);
        users.add(user2);
        if (accountUsers.isEmpty()) {
            System.out.println(Constant.emptyList);
        } else {
            System.out.print(Constant.findName);
            String findName = scanner.next();
            boolean checkName = false;
            for (int i = 0; i < users.size(); i++) {

                String upperCase = findName.toUpperCase();
                String upperCase1 = users.get(i).getName().toUpperCase();
                if (upperCase1.equals(upperCase)) {
                    System.out.println(accountUsers.get(i));
                    checkName = true;
                    break;
                }
            }
            if (!checkName) {
                System.out.println(Constant.noName);
            }
        }
    }

    @Override
    public void findAccountByBirthday() {
        users.add(user1);
        users.add(user2);
        if (accountUsers.isEmpty()) {
            System.out.println(Constant.emptyList);
        } else {
            System.out.println(Constant.findBirthday);
            String findBirthday = scanner.next();
            boolean checkBirthday = false;
            for (int i = 0; i < users.size(); i++) {
                if (findBirthday.equals(users.get(i).getBirthday())) {
                    System.out.println(accountUsers.get(i));
                    checkBirthday = true;
                    break;
                }

            }
            if (!checkBirthday) {
                System.out.println(Constant.noBirthday);
            }
        }

    }
}


