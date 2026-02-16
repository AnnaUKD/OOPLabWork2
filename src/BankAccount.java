import java.text.DecimalFormat;

public class BankAccount {
    private static int nextAccountNumber = 100000;
    private String accountNumber;
    private String ownerName;
    private double balance;

   
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        setOwnerName(ownerName);
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Баланс не може бути від'ємним. Встановлено 0.");
        }
    }

   
    public BankAccount(String ownerName, double balance) {
        this.accountNumber = generateAccountNumber();
        setOwnerName(ownerName);
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Баланс не може бути від'ємним. Встановлено 0.");
        }
    }

    private String generateAccountNumber() {
        return "UA" + (nextAccountNumber++);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String newOwnerName) {
        if (newOwnerName != null && newOwnerName.length() >= 3) {
            this.ownerName = newOwnerName;
        } else {
            System.out.println("Ім'я власника має містити щонайменше 3 символи.");
            if (this.ownerName == null) {
                this.ownerName = "Невідомий";
            }
        }
    }

    public void getAccountInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Номер рахунку: " + getAccountNumber());
        System.out.println("Власник: " + getOwnerName());
        System.out.println("Баланс: " + df.format(getBalance()));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Ви не можете внести нульову або від'ємну суму.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ви не можете зняти нульову або від'ємну суму.");
        } else if (amount > balance) {
            System.out.println("Недостатньо коштів на рахунку.");
        } else {
            balance -= amount;
        }
    }
}
