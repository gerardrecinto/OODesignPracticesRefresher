public class Account {
    //encapsulation. only available inside class. hidden inside class.
    //getters and setters part of encapsulation. encapsulate the values
    private float balance;
    public void deposit(float amount){
        if (amount >0){
            balance += amount;
        }
    }
    public void withdraw(float amount){
        if (amount >0){
            balance-=amount;
        }
    }
    //setter/mutator
    public void setBalance(float balance){
        if (balance > 0) {
            this.balance = balance;
        }
    }
    public float getBalance(){
        return balance;
    }
}
