package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlistpackage.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected;

    public HanoiRhymer() {
        totalRejected = 0;
    }

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(IntArrayStack intArrayStack, int totalRejected) {
        super(intArrayStack);
        this.totalRejected = totalRejected;
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
//        alt i strzalki przelaczaja miedzy otwartymi plikami w intellij
    }
}
