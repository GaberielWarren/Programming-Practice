package view;

import java.util.Scanner;

public class QuizProjectUI {
    Scanner scan;

    public QuizProjectUI() {
        scan = new Scanner(System.in);
    }

    public String getUserInput() {
        return scan.next();
    }
}
