package lv.javaguru.lessons.lesson2.methods;

import java.util.Scanner;

public class HumanAgeClassifierDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age: ");
        int age = scanner.nextInt();

        HumanAgeClassifier ageClassifier = new HumanAgeClassifier();
        String title = ageClassifier.classify(age);
        System.out.println("Title = " + title);
    }
}
