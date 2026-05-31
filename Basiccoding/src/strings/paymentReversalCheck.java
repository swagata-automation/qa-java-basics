package strings;

public class paymentReversalCheck{

    public static boolean isValidReversal(int debit, int credit) {
        return debit == -credit;
    }

    public static void main(String[] args) {

        int debit = 500;   // paid
        int credit = -500; // refund

        if (isValidReversal(debit, credit)) {
            System.out.println("Valid reversal");
        } else {
            System.out.println("Invalid reversal");
        }
    }
}