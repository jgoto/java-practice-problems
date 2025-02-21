/* Implement a BankAccount class with deposit and withdraw methods */
package Problems;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account name: ");
        String name = scan.nextLine();
        Account account = new Account(name);
        boolean loop = true;
        char input = ' ';
        while(loop){
            System.out.println("What action do you wish to take: (d=deposit w=withdraw q=quit)");
            input = scan.nextLine().toLowerCase().charAt(0);
            if(input == 'd'){
                System.out.println("Enter your deposit: ");
                double deposit = scan.nextDouble();
                scan.nextLine();
                account.deposit(deposit);
            }
            else if(input == 'w'){
                System.out.println("Enter your withdrawal: ");
                double withdraw = scan.nextDouble();
                scan.nextLine();
                account.withdraw(withdraw);
            }
            else if(input == 'q'){
                loop = false;
            }
            System.out.println(account.toString());
        }
        scan.close();
    }
}

class Account{
    private String accountName;
    private double balance;
    
    Account(String label){
        this.accountName = label;
        this.balance = 0.00;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f", accountName, balance);
    }
}
