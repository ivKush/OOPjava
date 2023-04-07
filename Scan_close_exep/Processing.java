package Scan_close_exep;

import java.util.Scanner;

public class Processing extends FuncResult {

    public static void main(String[] args) {
        Processing process = new Processing();
        process.Start();
    }

    
    public void Start() {
        
        Sourse sourse = new Sourse();
        Scan scan = new Scan();
        System.out.println("Для выхода - exit");
        System.out.println();
        System.out.println("Начало работы:");
        boolean flag = true;
        sourse.setNum1(scan.scannerNum());
        while (flag) {
            sourse.setOperator(scan.scannerStr());
            if (sourse.getOperator().equals("+")) {
                sourse.setNum1(addition(sourse.getNum1(), scan.scannerNum()));
                System.out.println(sourse.getNum1());
            } else if (sourse.getOperator().equals("-")) {
                sourse.setNum1(substrction(sourse.getNum1(), scan.scannerNum()));
                System.out.println(sourse.getNum1());
            } else if (sourse.getOperator().equals("*")) {
                sourse.setNum1(multiplication(sourse.getNum1(), scan.scannerNum()));
                System.out.println(sourse.getNum1());
            } else if (sourse.getOperator().equals("/")) {
                sourse.setNum1(division(sourse.getNum1(), scan.scannerNum()));
                System.out.println(sourse.getNum1());
            } else {
                flag = false;
            }
        }
        // ((Scanner) scan.sc).close();
    }
    
}
