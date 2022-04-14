package main;

public class Num {

    public static boolean isNum(String a, String b) {
        try {
            int first = Integer.parseInt(a);
            int second = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int getNum(String a) throws Exception {
        int num = Integer.parseInt(a);
        if (num >= 1 && num <= 10) {
            return num;
        }
        throw new Exception("The number is not in the required range");
    }

}