import java.util.*;

public class MiniBankingMenu{
  public static void main() {
    Scanner scanner = new Scanner(System.in);
    LinkedList <BankAccount> Accaunts = new LinkedList<>();
    Stack <String> transactions = new Stack<>();
    Queue <String> billQueue = new LinkedList<>();
    Queue <BankAccount> accountRequests = new LinkedList<>();
    int id = 0;
    while(true){
      System.out.println("1 - Enter Bank");
      System.out.println("2 - Enter ATM");
      System.out.println("3 - Admin Area");
      System.out.println("4 - Exit");
      System.out.print("Choose one:");
      int choice = scanner.nextInt();
      scanner.nextLine();
      boolean tomenu = false;
      switch (choice){
        case 1:
          while(!tomenu){
            System.out.println("Bank Menu");
            System.out.println("1.Submit account opening request");
            System.out.println("2.Deposit money");
            System.out.println("3.Withdraw money");
            System.out.println("4.Back to Menu");
            System.out.print("Choose one: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number){
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
                System.out.println();
                break;
              case 3:
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
                System.out.println();
                break;
              case 4:
                tomenu = true;
                break;
              default:
                System.out.println("Invalid choice!");
            }
          }
          if(tomenu){
            System.out.println();
            break;
          }
        case 2:
          System.out.println("1.Balance enquiry");
          System.out.println("2.Withdraw");
          System.out.println("3.Back to Menu");
          System.out.print("Choose one: ");
          int number = scanner.nextInt();
          scanner.nextLine();
          switch (number){
            case 1:
              System.out.print("Enter username: ");
              String username = scanner.nextLine();
              boolean isFound = false;
              for(BankAccount account : Accaunts){
                if(account.getUsername().equals(username)){
                  isFound = true;
                  account.information();
                }
              }
              if(!isFound){
                System.out.println("Not found");
              }
              System.out.println();
              break;
            case 2:
              System.out.print("Enter username: ");
              username = scanner.nextLine();
              isFound = false;
              for(BankAccount account : Accaunts){
                if(account.getUsername().equals(username)){
                  isFound = true;
                  System.out.print("Enter amount to withdraw: ");
                  int withdraw = scanner.nextInt();
                  scanner.nextLine();
                  while(withdraw > account.getBalance() || withdraw < 1){
                    System.out.println("Invalid number!");
                    System.out.print("Enter again: ");
                    withdraw = scanner.nextInt();
                    scanner.nextLine();
                  }
                  account.setBalance(account.getBalance() - withdraw);
                }
              }
              if(!isFound){
                System.out.println("Not found");
              }
              System.out.println();
              break;
            case 3:
              tomenu = true;
              break;
            default:
              System.out.println("Invalid choice!");
              tomenu = true;
              break;
          }
          if(tomenu){
            System.out.println();
            break;
          }
        case 3:
          while(!tomenu){
            System.out.println("Admin Menu");
            System.out.println("1.View accaunt queue");
            System.out.println("2.Process accaunt queue");
            System.out.println("3.View bill payment queue");
            System.out.println("4.Back to Menu");
            System.out.print("Choose one: ");
            number = scanner.nextInt();
            scanner.nextLine();
            switch (number){
              case 1:
                System.out.println("Accaunts");
                int i = 1;
                for(BankAccount account : accountRequests){
                  System.out.print(i + ". ");
                  account.information();
                  i++;
                }
                if(accountRequests.isEmpty()){
                  System.out.println("No request found!");
                }
                System.out.println();
                break;
              case 2:
                i = 1;
                for(BankAccount account : accountRequests){
                  System.out.print(i + ". ");
                  account.information();
                  i++;
                  System.out.println("Approve: Y/N?");
                  String ans = scanner.nextLine();
                  if(ans.equals("Y")){
                    accountRequests.poll();
                  }
                  else{
                    System.out.println();
                    break;
                  }
                }
                if(accountRequests.isEmpty()){
                  System.out.println("No request found!");
                }
                System.out.println();
                break;
              case 3:
                i = 1;
                System.out.println("Bill Payment Queue");
                for(String bill : billQueue){
                  System.out.println(i + ". " +  bill);
                  i++;
                }
                if(billQueue.isEmpty()){
                  System.out.println("No bill payment found!");
                }
                System.out.println();
              case 4:
                tomenu = true;
                break;
              default:
                tomenu = true;
                System.out.println("Invalid choice!");
                break;
            }
          }
          if(tomenu){
            System.out.println();
            break;
          }
        case 4:
          System.out.println("Good Bye!");
          return;
        default:
          System.out.println("Invalid choice!");
          break;
      }
    }
  }
}