package TugasPraktikum3No2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance, choice=0, amount;
        String name, id;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Name: ");
        name = scan.nextLine();
        System.out.print("Input ID: ");
        id = scan.nextLine();
        System.out.print("Input Balance: ");
        balance = scan.nextInt();
        
        Account dummy = new Account("123", "Dummy");
        Account account = new Account(id, name, balance);

        while(choice!=4){
            System.out.println("\n1. Debit");
            System.out.println("2. Credit");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");
            System.out.print("Input Number: ");
            choice = scan.nextInt();
            if(choice==1){
                System.out.print("Input Debit Amount: ");
                amount = scan.nextInt();
                account.debit(amount);
            }
            else if (choice==2){
                System.out.print("Input Credit Amount: ");
                amount = scan.nextInt();
                account.credit(amount);
            }
            else if(choice==3){
                System.out.print("Input Transfer Amount: ");
                amount = scan.nextInt();
                account.transferTo(amount, dummy);
            }
            else if(choice==4){
                break;
            }
            else{
                System.out.println("Error! Wrong Number.");
            }
        }
        scan.close();
        System.out.println(account.toString());
    }
}
