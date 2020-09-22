package TugasPraktikum3No2;
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance=balance;
    }
    public  String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public  int getBalance(){
        return balance;
    }

    public void credit(int amount){
        balance += amount;
        System.out.println("Updated Balance = " + balance);
    }
    public void debit(int amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println("Updated Balance = " + balance);
        }
        else{
            System.out.println("Your balance is not enough.");
        }
    }

    public void transferTo(int amount, Account transfered){
        if(amount<=balance){
            transfered.credit(amount);
            balance -= amount;
            System.out.println("Transfered Successfully!");
            System.out.println("Updated Balance = " + balance);
            System.out.println("Transfered Dummy Account Balance = " + transfered.getBalance());
        }
        else{
            System.out.println("Your balance is not enough.");
        }
    }

    public String toString(){
        return "Account [Id = " + id + ", Name = " + name + ", Balance = Rp. " + balance + "]";
    }
}
