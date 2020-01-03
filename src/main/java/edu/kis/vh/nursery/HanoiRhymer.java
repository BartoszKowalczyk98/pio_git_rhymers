package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalrejected = 0;

    public int reportRejected() {
        return totalrejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalrejected++;
        else
            super.countIn(in);
//        alt i strzalki przelaczaja miedzy otwartymi plikami w intellij
    }
}
