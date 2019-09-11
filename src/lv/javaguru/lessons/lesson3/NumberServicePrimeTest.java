package lv.javaguru.lessons.lesson3;

class NumberServicePrimeTest {

    public static void main(String[] args) {
        NumberService service = new NumberService();

        int sum = 0;
        int count = 0;
        for (int number = 1; number <= 500; number++) {
            if (number == 17 || number == 71) {
                continue;
            }
            if (count == 50) {
                break;
            }
            if (service.isPrimeNumber(number)) {
                count++;
                sum = sum + number;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }
}
