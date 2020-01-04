package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackandlistpackage.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public IntArrayStack temp;

    public FIFORhymer() {
        this.temp = new IntArrayStack();
    }

    public FIFORhymer(IntArrayStack temp) {
        this.temp = temp;
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
