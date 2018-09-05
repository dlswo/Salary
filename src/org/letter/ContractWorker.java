package org.letter;

public class ContractWorker implements Salary {

    double yearSal;
    double extraPay;

    @Override
    public double calc() {
        return yearSal/12 + extraPay;
    }
}
