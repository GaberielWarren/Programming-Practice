package view;

import java.util.HashMap;

public class QuizProjectView {
    private final QuizProjectUI ui;
    private int questionCount;

    public QuizProjectView(QuizProjectUI ui) {
        this.ui = ui;
        questionCount = 0;
    }

    public void startingScreen() {
        System.out.println("Welcome to the Java's Quiz!");
        System.out.println("This Quiz will have multiple questions and question types.");
    }
    public String userOrMaker() {
        System.out.print("Are you a Quiz taker(1) or a Quiz maker(2)?: ");
        return ui.getUserInput();
    }

    public String getUserInput() {
       return ui.getUserInput();
    }

    public void stateQuestion(String question) {
        questionCount++;
        System.out.println("\nHere is question number " + questionCount + ":");
        System.out.println(question);
    }
    public void stateAnswerText (String answer) {
        if (answer.equals("")) {
            return;
        }
        System.out.println(answer);
    }
    public String stateAnswer() {
        System.out.print("Input your answer: ");
        return getUserInput();
    }

    public void checkAnswer(boolean checkAnswer) {
        if (checkAnswer) {
            System.out.println("You got it right!");
        }
        else {
            System.out.println("You got it wrong!");
        }
    }

    public void displayPoints(double points) {
        System.out.printf("You got %.2f percent correct!", points);
    }

    public void displayHash(String hash) {
        if (hash.isEmpty()) {
            return;
        }
        System.out.println("You got these questions wrong!:");
        System.out.println(hash);
    }
}
