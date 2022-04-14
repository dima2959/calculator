package main;

public class RimNum {
    public static void general(String[] numAndOper) {
        try {
            int a = convert(numAndOper[0]);
            int b = convert(numAndOper[2]);
            int r = MathOperation.result(a, numAndOper[1], b);
            if (r < 1) {
                throw new Exception("less one");
            }
            String text = String.join(" ", String.valueOf(r).split(""));
            String[] textArray = text.split(" ");
            int l = textArray.length;
            if (l == 1) {
                System.out.println(convertToRim(textArray[0]));
            } else if (l == 2) {
                System.out.println(convertToRimDec(textArray[0]) + convertToRim(textArray[1]));
            } else System.out.println("C");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static int convert(String a) throws Exception {
        return switch (a) {
            case ("I") -> 1;
            case ("II") -> 2;
            case ("III") -> 3;
            case ("IV") -> 4;
            case ("V") -> 5;
            case ("VI") -> 6;
            case ("VII") -> 7;
            case ("VIII") -> 8;
            case ("IX") -> 9;
            case ("X") -> 10;
            default -> throw new Exception("The number is not in the required range");
        };
    }

    public static String convertToRimDec(String a) throws Exception {
        return switch (a) {
            case "1" -> "X";
            case "2" -> "XX";
            case "3" -> "XXX";
            case "4" -> "XL";
            case "5" -> "L";
            case "6" -> "LX";
            case "7" -> "LXX";
            case "8" -> "LXXX";
            case "9" -> "XC";
            default -> throw new Exception("The number is not in the required range");
        };
    }

    public static String convertToRim(String a) throws Exception {
        return switch (a) {
            case "0" -> "";
            case "1" -> "I";
            case "2" -> "II";
            case "3" -> "III";
            case "4" -> "IV";
            case "5" -> "V";
            case "6" -> "VI";
            case "7" -> "VII";
            case "8" -> "VIII";
            case "9" -> "IX";
            default -> throw new Exception("The number is not in the required range");
        };
    }
}