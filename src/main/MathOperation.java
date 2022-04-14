package main;

public class MathOperation {
    public static int result(int a, String operation, int b) throws Exception {
        if ("+".equals(operation)) {
            return a + b;
        } else if ("-".equals(operation)) {
            return a - b;
        } else if ("/".equals(operation)) {
            return a / b;
        } else if ("*".equals(operation)) {
            return a * b;
        } else throw new Exception(
                "the format of the mathematical operation does not satisfy the task - two operands and one operator (+, -, /, *)");
    }
}