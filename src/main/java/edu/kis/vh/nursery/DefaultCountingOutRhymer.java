package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlistpackage.IntArrayStack;

public class DefaultCountingOutRhymer {
    IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
