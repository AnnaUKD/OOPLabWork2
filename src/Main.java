//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345614", "Оа", 1000.5);
        BankAccount account1 = new BankAccount("3421414", "Андрій", 50000.5);
        BankAccount account2 = new BankAccount("8569621", "Богдан", 20000.5);
        BankAccount account3 = new BankAccount("8749585", "Мілена", 100000.5);
        BankAccount account4 = new BankAccount("6859608", "Василь", 2000.5);
        BankAccount account5 = new BankAccount("8904167", "Лілія", 15000.0);


        account.getAccountInfo();

        account.deposit(250.75f);
        account.getAccountInfo();
        account.withdraw(300f);
        account.getAccountInfo();
        account.setOwnerName("Ол");
        account.getAccountInfo();

        account.setOwnerName("Олена-Анна");
        account.getAccountInfo();

    }

}

