package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlistpackage.IntLinkedList;

public class ListCountingOutRhymer extends DefaultCountingOutRhymer {
    IntLinkedList intLinkedList;

    public ListCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }

    public ListCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

}
