public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new BankAccount(1, "Ali", 150000);
        accounts[1] = new BankAccount(2, "Beka", 220000);
        accounts[2] = new BankAccount(3, "Petr", 180000);

        System.out.println("Accounts List:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + ". " + accounts[i].getUsername() + " – Balance: " + accounts[i].getBalance());
        }
    }
}