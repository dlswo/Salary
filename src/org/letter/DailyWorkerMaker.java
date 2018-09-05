package org.letter;

public class DailyWorkerMaker extends AbstractMaker {

    @Override
    public Salary make() {
        System.out.println("일용직 만들기");
        DailyWorker obj =  new DailyWorker();

        obj.workHour = inputI("일용직의 일한 시간은 얼마인가요?");
        obj.pay = inputD("일용직의 시급은 얼마인가요?");

        return obj;


    }
}
