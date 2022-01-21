package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS = 12;
    private static final int INT = -1;
    private static final int NEGATIVE_TOTAL_NUMBER = -1;
    private static final int FULL = 11;
    private final int[] numbers = new int[NUMBERS];

    private int total = NEGATIVE_TOTAL_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_TOTAL_NUMBER;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT;
        return numbers[total--];
    }

}
