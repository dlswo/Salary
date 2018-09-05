package org.letter;

import java.util.Scanner;

public abstract class AbstractMaker {

    Scanner scanner;

    public AbstractMaker() {
        this.scanner = new Scanner(System.in);
    }

    public double inputD(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scanner.nextLine());
    }

    public int inputI(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scanner.nextLine());
    }

    public abstract Salary make();
}
