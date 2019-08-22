package lv.javaguru.lessons.lesson1;

public class MathOperations {

    public static void main(String[] args) {
        int firstNumber = 1000;
        int secondNumber = 30;

        int sumResult = firstNumber + secondNumber;
        System.out.println("Sum result = " + sumResult);
        int subtractResult = firstNumber - secondNumber;
        System.out.println("Subtract result = " + subtractResult);
        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply result = " + multiplyResult);
        double divideResult = firstNumber / (double) secondNumber;
        System.out.println("Divide result = " + divideResult);
    }
}
