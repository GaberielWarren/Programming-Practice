package model;

public class QuestionMultipleChoice extends Question {
    private String[] choices;
    private String answer;
    private char answers;
    private String questionText;
    private String answerText;


    public QuestionMultipleChoice() {
        questionText = "How many states is USA?";
        choices = new String[]{"50", "49", "25", "-50"};
        answer = "a";
        answers = 'a';
        answerText = "";
    }

    @Override
    public String getQuestionText() {
        return questionText;
    }
    @Override
    public String getAnswerText() {
        for (int i = 0; i < choices.length; i++) {
            answerText += answers + ". " + choices[i] + "\t";
            answers += 1;
        }
        answers = 0;
        return answerText;
    }
    @Override
    public String getAnswer() {
        return answer;
    }
}