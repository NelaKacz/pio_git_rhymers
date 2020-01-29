package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    final private DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            defaultCountingOutRhymer.countIn(super.countOut());
        int out = defaultCountingOutRhymer.countOut();
        while (!defaultCountingOutRhymer.callCheck())
            countIn(defaultCountingOutRhymer.countOut());
        return out;
    }
}
