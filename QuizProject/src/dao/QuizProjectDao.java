package dao;

import model.*;

import java.util.ArrayList;

public class QuizProjectDao {
    private final ArrayList<Question> quiz;
    private int questionNum;
    private double points;

    public QuizProjectDao() {
        quiz = new ArrayList<>();
        questionNum = 0;
        points = 0;
    }

    public int getNumQuestions() {
        presetQuestions();
        return quiz.size();
    }

    public void presetQuestions() {
        QuestionGuess guess = new QuestionGuess();
        QuestionMultipleChoice multipleChoice = new QuestionMultipleChoice();
        quiz.add(guess);
        quiz.add(multipleChoice);
    }

    public String getQuestion() {
        questionNum++;
        return quiz.get(questionNum - 1).getQuestionText();
    }
    public String getAnswerText() {
        return quiz.get(questionNum - 1).getAnswerText();
    }

    public String getAnswer() {
        return quiz.get(questionNum - 1).getAnswer();
    }

    public boolean compareAnswer(String userInput) {
        return addPoints(userInput.equals(quiz.get(questionNum - 1).getAnswer()));
    }

    private boolean addPoints(boolean point) {
        if (point) {
            points++;
        }
        return point;
    }

    public double getPoints() {
        return (points / quiz.size());
    }
}
