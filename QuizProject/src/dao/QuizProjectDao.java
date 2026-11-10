package dao;

import model.*;

import java.util.ArrayList;

public class QuizProjectDao {
    private ArrayList<Question> quiz;
    int questionNum;

    public QuizProjectDao() {
        quiz = new ArrayList<>();
        questionNum = 0;
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

    public String getAnswer() {
        return quiz.get(questionNum - 1).getAnswer();
    }

    public boolean compareAnswer(String userInput) {
        if (userInput.equals(quiz.get(questionNum - 1).getAnswer())) {
            return true;
        }
        else {
            return false;
        }
    }
}
