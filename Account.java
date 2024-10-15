public class Account {
    private String id;
    private String name;
    private int balance;

    Account(){
        int balance = 0;
    }

    Account( String id, String name){
        this.id = id;
        this.name = name;
    }
    Account( String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }





}
