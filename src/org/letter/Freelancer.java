package org.letter;

public class Freelancer implements Salary {

    double yearSal; //연봉
    double lunch;   //점심


    @Override
    public double calc() {
        return (yearSal/12 + lunch);
    }
}
