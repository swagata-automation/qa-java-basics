package strings;

import java.util.*;

public class PaymentReversalCheck {

    //  1. Single transaction check
    public static boolean isValidReversal(int debit, int credit) {
        return debit == -credit;
    }

    //  2. Multiple transactions check (Two Pointer Logic)
    public static boolean isValidTransactionList(List<Integer> list) {

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            if (list.get(start) != -list.get(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        //  Case 1: Single transaction
        int debit = 500;
        int credit = -500;

        if (isValidReversal(debit, credit)) {
            System.out.println("Single Transaction: Valid reversal");
        } else {
            System.out.println("Single Transaction: Invalid reversal");
        }

        //  Case 2: Multiple transactions
        List<Integer> transactions = Arrays.asList(500, 200, -200, -500);

        if (isValidTransactionList(transactions)) {
            System.out.println("Transaction List: All transactions are properly reversed");
        } else {
            System.out.println("Transaction List: Mismatch found");
        }
    }
}