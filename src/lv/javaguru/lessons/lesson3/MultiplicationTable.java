package lv.javaguru.lessons.lesson3;

class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multiply = i * j;
                System.out.print(multiply + " ");
            }
            System.out.println();
        }
    }
}
