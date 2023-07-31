package abstraction;

public class nmb extends Bank{

    @Override
    void interestRate() {
        System.out.println("interest rate of our bank is 12%");
    }

    @Override
    void deposit() {
        System.out.println("deposit amount must be more than 5k");
    }
}
