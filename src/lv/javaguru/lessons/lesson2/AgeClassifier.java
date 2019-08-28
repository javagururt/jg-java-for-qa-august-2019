package lv.javaguru.lessons.lesson2;

import java.util.Scanner;

public class AgeClassifier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter age: ");
        int age = in.nextInt();
        if ((age >= 0) && (age < 4)) {
            System.out.println("Baby");
        } else if ((age > 3) && (age < 13)) {
            System.out.println("Child");
        } else if ((age > 12) && (age < 19)) {
            System.out.println("Teenager");
        } else if ((age > 18) && (age < 56)) {
            System.out.println("Hard working depressed person");
        } else if ((age > 55) && (age < 101)) {
            System.out.println("Senior");
        } else {
            System.out.println("Incorrect age");
        }
    }
}
