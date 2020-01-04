package edu.kis.vh.nursery.stackandlistpackage;

public class IntArrayStack implements IntArrayStackInterface {
    private int[] numbers = new int[INT];

    public int total = INT1;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == INT1;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return 0;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return 0;
        return numbers[total--];
    }
}
