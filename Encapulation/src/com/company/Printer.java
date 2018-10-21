package com.company;

/**
 * Created by T-RAIN on 2018/6/15.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUp() {
        this.tonerLevel = 100;
        System.out.println("Printer filled up. ");
    }

    public void printing() {
        if (this.tonerLevel <= 0) {
            System.out.println("No toner. ");
            return;
        }
        if (!isDuplex) {
            this.pagesPrinted ++;
            this.tonerLevel--;
            System.out.println("Printed one page. ");
        }

        else {
            this.pagesPrinted += 2;
            this.tonerLevel -= 2;
            System.out.println("Printed 2 pages. ");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
