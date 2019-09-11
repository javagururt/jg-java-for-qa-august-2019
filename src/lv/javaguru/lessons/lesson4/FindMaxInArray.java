package lv.javaguru.lessons.lesson4;

class FindMaxInArray {

    public static void main(String[] args) {
        int[] array = {2, 123, 41, 56, 65, 7897, 213, 546456, 76645, 26789};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Max = " + max);
    }
}
