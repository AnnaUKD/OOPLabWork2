import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Олександр", 1000.5);
        BankAccount account1 = new BankAccount("Андрій", 50000.5);
        BankAccount account2 = new BankAccount("Богдан", 20000.5);
        BankAccount account3 = new BankAccount("Мілена", 100000.5);
        BankAccount account4 = new BankAccount("Василь", 2000.5);
        BankAccount account5 = new BankAccount("Лілія", 15000.0);

        BankAccount[] accounts = new BankAccount[]{
                account, account1, account2, account3, account4, account5
        };

        account.getAccountInfo();
        account.deposit(250.75);
        account.getAccountInfo();
        account.withdraw(300);
        account.getAccountInfo();
        account.setOwnerName("Ол");
        account.getAccountInfo();
        account.setOwnerName("Олексій");
        account.getAccountInfo();

        account1.getAccountInfo();
        account1.deposit(250.75);
        account1.getAccountInfo();
        account1.withdraw(300);
        account1.getAccountInfo();
        account1.setOwnerName("Ен");
        account1.getAccountInfo();
        account1.setOwnerName("Ендрю");
        account1.getAccountInfo();

        account2.getAccountInfo();
        account2.deposit(250.75);
        account2.getAccountInfo();
        account2.withdraw(300);
        account2.getAccountInfo();
        account2.setOwnerName("Б");
        account2.getAccountInfo();
        account2.setOwnerName("Богдан-Пантеон");
        account2.getAccountInfo();

        account3.getAccountInfo();
        account3.deposit(250.75);
        account3.getAccountInfo();
        account3.withdraw(300);
        account3.getAccountInfo();
        account3.setOwnerName("Мл");
        account3.getAccountInfo();
        account3.setOwnerName("Мілен");
        account3.getAccountInfo();

        account4.getAccountInfo();
        account4.deposit(250.75);
        account4.getAccountInfo();
        account4.withdraw(300);
        account4.getAccountInfo();
        account4.setOwnerName("Ва");
        account4.getAccountInfo();
        account4.setOwnerName("Василій");
        account4.getAccountInfo();

        account5.getAccountInfo();
        account5.deposit(250.75);
        account5.getAccountInfo();
        account5.withdraw(300);
        account5.getAccountInfo();
        account5.setOwnerName("Лі");
        account5.getAccountInfo();
        account5.setOwnerName("Ліліян");
        account5.getAccountInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведіть номер рахунку для пошуку:");
        String searchNumber = scanner.nextLine();

        BankAccount foundAccount = findAccountByNumber(accounts, searchNumber);
        if (foundAccount != null) {
            System.out.println("Рахунок знайдено:");
            foundAccount.getAccountInfo();
        } else {
            System.out.println("Рахунок з номером " + searchNumber + " не знайдено.");
        }

        scanner.close();
    }

    public static BankAccount findAccountByNumber(BankAccount[] accounts, String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
}

