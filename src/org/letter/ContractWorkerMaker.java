package org.letter;

public class ContractWorkerMaker extends AbstractMaker {

    @Override
    public Salary make() {
        System.out.println("계약직 만들기");
        ContractWorker obj =  new ContractWorker();

        obj.yearSal = inputI("계약직의 연봉은 얼마인가요?");
        obj.extraPay = inputD("계약직의 야근수당은 얼마인가요?");

        return obj;
    }
}
