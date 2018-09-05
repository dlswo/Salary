package org.letter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryCalculator {

    public void doJob()throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월급 계산기 입니다.");
        System.out.println("직원의 종류를 선택하세요.");

        String prefix = "org.letter.";
        String className = prefix + scanner.nextLine();

        AbstractMaker maker = (AbstractMaker)Class.forName(className).newInstance();
        Salary emp = maker.make();
        System.out.println("당신의 월급은 : " + Math.round(emp.calc()*100)/100.0 + "입니다.");

    }
}
