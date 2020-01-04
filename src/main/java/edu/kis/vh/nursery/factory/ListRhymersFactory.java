package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.*;

public class ListRhymersFactory implements Rhymersfactory {
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new ListCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new ArrayCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}
