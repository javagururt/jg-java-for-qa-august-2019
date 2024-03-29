package lv.javaguru.lessons.lesson3;

public class NumberService {

    public int sumInRange(int firstNumber, int secondNumber) {
        int sum = 0;
        while (firstNumber <= secondNumber) {
            sum = firstNumber + sum;
            System.out.println("First Number = " + firstNumber + "; temp.sum = " + sum);
            firstNumber++;
        }
        return sum;
    }

    public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
