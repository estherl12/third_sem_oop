package abstraction;

public class Main {
    public static void main(String[] args) {


        Bank b = new Bank() {
            @Override
            void interestRate() {
                System.out.println("our rate is 10%");
            }

            @Override
            void deposit() {
                System.out.println("depositing");
            }


        };
        b.deposit();

    }
}
