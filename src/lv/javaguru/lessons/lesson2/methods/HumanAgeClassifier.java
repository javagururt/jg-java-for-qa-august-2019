package lv.javaguru.lessons.lesson2.methods;

public class HumanAgeClassifier {

    public String classify(int age) {
        if (age >= 0 && age < 4) {
            return "Baby";
        }
        if (age > 3 && age < 13) {
            return "Child";
        }
        if (age > 12 && age < 19) {
            return "Teenager";
        }
        if (age > 18 && age < 56) {
            return "Hard working depressed person";
        }
        if (age > 55 && age < 101) {
            return "Senior";
        }
        return "Incorrect data";
    }
}
