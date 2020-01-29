package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int size = 12;
    private final int notSet = -1;

    private int total = notSet;
    private int[] numbers = new int[size];

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public int countOut() {
        if (callCheck()) {
            return notSet;
        }
        return numbers[total--];
    }

    boolean callCheck() {
        return total == notSet;
    }

    boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck()) {
            return notSet;
        }
        return numbers[total];
    }
}
