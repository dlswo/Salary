package org.letter;

public class DailyWorker implements Salary {

    int workHour;
    double pay;

    @Override
    public double calc() {
        return (workHour * pay);
    }
}
