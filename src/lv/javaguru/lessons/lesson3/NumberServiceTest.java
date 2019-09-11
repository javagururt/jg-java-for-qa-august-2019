package lv.javaguru.lessons.lesson3;

class NumberServiceTest {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        int actualResult = service.sumInRange(4, 1);
        int expected = 10;

        if (actualResult == expected) {
            System.out.println("URA! Success!");
        } else {
            System.out.println("T_T Fail! expected = " + expected + " actual = " + actualResult);
        }
    }
}
