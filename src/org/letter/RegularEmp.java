package org.letter;

public class RegularEmp implements Salary {

    double yearSal;
    double extraPay;
    double lunch;


    @Override
    public double calc() {
        return (yearSal/12 + extraPay + lunch);
    }
}
