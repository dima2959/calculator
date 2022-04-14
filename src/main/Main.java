package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] numAndOper = str.split(" ");
        try {
            if (numAndOper.length != 3) {
                throw new Exception("wrong number of elements in array");
            }
            boolean isItNum = Num.isNum(numAndOper[0], numAndOper[2]);
            if (isItNum) {
                int a = Num.getNum(numAndOper[0]);
                int b = Num.getNum(numAndOper[2]);
                System.out.println(MathOperation.result(a, numAndOper[1], b));
            } else {
                RimNum.general(numAndOper);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

}