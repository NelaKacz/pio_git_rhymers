package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}

// alt + <- oraz alt + ->
// w IntelliJ IDEA te skróty klawiszowe powodują zmianę podglądu na plik po prawo lub po lewo
// spośród tych otworzonych w edytorze
