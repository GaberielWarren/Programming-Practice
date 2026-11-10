package model;

public class QuestionMultipleChoice extends Question {
    private String[] choices;
    private String answer;
    private String questionText;

    public QuestionMultipleChoice() {
        questionText = "How many stats is USA?";
        choices = new String[]{"50", "49", "25", "-50"};
        answer = choices[0];
    }
}