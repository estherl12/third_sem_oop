package abstraction;

public abstract class Bank {
    //abstract class do not contain objects.
    //abstract class contains both abs and non abs methods
    abstract void interestRate();
    abstract void deposit();

    //non ab method - must be static
    static void name(){
        System.out.println("our bank is central bank");
    }
}
