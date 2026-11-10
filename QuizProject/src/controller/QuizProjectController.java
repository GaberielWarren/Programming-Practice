package controller;

import dao.QuizProjectDao;
import view.QuizProjectView;

public class QuizProjectController {
    private final QuizProjectView view;
    private final QuizProjectDao dao;
    int numQuestionsL;
    boolean checkAnswer;

    public QuizProjectController(QuizProjectView view, QuizProjectDao dao) {
        this.view = view;
        this.dao = dao;
        numQuestionsL = dao.getNumQuestions();
        checkAnswer = false;
    }

    public void start() {
        view.startingScreen();
        while (numQuestionsL > 0) {
            stateQuestion();
            checkAnswer = dao.compareAnswer(view.stateAnswer(dao.getAnswer()));
            view.checkAnswer(checkAnswer);
            numQuestionsL--;
        }
    }

    public void stateQuestion() {
        view.stateQuestion(dao.getQuestion());
    }
}
