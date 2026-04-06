import java.util.*;

public class assignment2{
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        LinkedList <BankAccount> Accaunts = new LinkedList<>();
        Stack <String> transactions = new Stack<>();
        Queue <String> billQueue = new LinkedList<>();
        Queue <BankAccount> accountRequests = new LinkedList<>();
        int id = 0;
        while(true){
            System.out.println("1.Add account request to queue");
            System.out.println("2.Display all accounts");
            System.out.println("3.Search account by username");
            System.out.println("4.Deposit money");
            System.out.println("5.Withdraw money");
            System.out.println("6.Undo last transaction");
            System.out.println("7.Display last transaction");
            System.out.println("8.Add bill payment request");
            System.out.println("9.Process next bill payment");
            System.out.println("10.Display bill payment queue");
            System.out.println("11.Process request (for admins)");
            System.out.println("12.Display pending requests");
            System.out.println("13.Quit");
            System.out.print("Choose one:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    accountRequests.add(new BankAccount(++id , username , balance));
                    System.out.println("Accaunt request added successfully to the queue");
                    System.out.println();
                    break;
                case 2:
                    int i = 1;
                    for(BankAccount account : Accaunts){
                        System.out.println(i + ". ");
                        account.information();
                        i++;
                    }
                    if(i == 1){
                        System.out.println("No accaunt found!");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    i = 1;
                    for(BankAccount account : Accaunts){
                        if(account.getUsername().equals(username)){
                            System.out.println(i + ".");
                            account.information();
                            i++;
                        }
                    }
                    if(i == 1){
                        System.out.println("No accaunts found!");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    boolean isFound = false;
                    for(BankAccount account : Accaunts){
                        if(account.getUsername().equals(username)){
                            System.out.print("Deposit: ");
                            double deposit = scanner.nextDouble();
                            scanner.nextLine();
                            account.deposit(deposit);
                            isFound = true;
                            System.out.println("New balance: " + account.getBalance());
                            transactions.add("Deposit " + deposit + " to " + username);
                        }
                    }
                    if(!isFound){
                        System.out.println("Username not found!");
                    }
                    else System.out.println();
                    break;
                case 5:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    isFound = false;
                    for(BankAccount account : Accaunts){
                        if(account.getUsername().equals(username)){
                            System.out.print("Withdraw: ");
                            double withdraw = scanner.nextDouble();
                            scanner.nextLine();
                            account.withdraw(withdraw);
                            isFound = true;
                            System.out.println("New balance: " + account.getBalance());
                            transactions.add("Withdraw " + withdraw + " from " + username);
                        }
                    }
                    if(!isFound){
                        System.out.println("Username not found!");
                    }
                    else System.out.println();
                case 6:
                    String last = transactions.peek();
                    if(last.charAt(0) == 'W'){
                        System.out.println("Undo → Withdraw removed");
                    }
                    else{
                        System.out.println("Undo → Deposit removed");
                    }
                    transactions.pop();
                    System.out.println();
                    break;
                case 7:
                    if(transactions.isEmpty()){
                        System.out.println("No transactions found!");
                        break;
                    }
                    last = transactions.peek();
                    System.out.println("Last transaction: " + last);
                    break;
                case 8:
                    System.out.print("Enter bill payment request:");
                    String request = scanner.nextLine();
                    billQueue.offer(request);
                    System.out.println("Added: " + request);
                    break;
                case 9:
                    if(billQueue.isEmpty()){
                        System.out.println("No bill payment request found!");
                        break;
                    }
                    System.out.println("Processing: " + billQueue.peek());
                    billQueue.remove();
                    break;
                case 10:
                    if(billQueue.isEmpty()){
                        System.out.println("No bill payment request found!");
                        break;
                    }
                    System.out.println("Remaining: " + billQueue.peek());
                    break;
                case 11:
                    if(accountRequests.isEmpty()){
                        System.out.println("No request found!");
                    }
                    i = 1;
                    for(BankAccount account : accountRequests){
                        System.out.print(i + ".");
                        i++;
                        account.information();
                        System.out.print("Approve? (Y/N): ");
                        String c = scanner.nextLine();
                        if(c.equals("Y")){
                            Accaunts.add(account);
                        }
                        accountRequests.remove();
                    }
                    System.out.println();
                    break;
                case 12:
                    if(accountRequests.isEmpty()){
                        System.out.println("No request found!");
                    }
                    i = 1;
                    for(BankAccount account : accountRequests){
                        System.out.print(i + ".");
                        i++;
                        account.information();
                    }
                    System.out.println();
                    break;
                case 13:
                    System.out.println("Good Luck!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}