package controller;

import dao.QuizProjectDao;
import view.QuizProjectView;

public class QuizProjectController {
    private final QuizProjectView view;
    private final QuizProjectDao dao;
    int numQuestionsL;
    String userOrMaker;

    public QuizProjectController(QuizProjectView view, QuizProjectDao dao) {
        this.view = view;
        this.dao = dao;
        numQuestionsL = dao.getNumQuestions();
    }

    public void start() {
        view.startingScreen();
        userOrMaker = view.userOrMaker();
        if (userOrMaker.equals("1")) {
            while (numQuestionsL > 0) {
                stateQuestion();
                stateAnswerText();
                numQuestionsL--;
            }
        }
        else if (userOrMaker.equals("2")) {
            System.out.println("Welcome, you can't make any right now it is a WIP, bye!");
            System.exit(0);
        }
        else {
            System.out.println("That is the wrong input, bye!");
            System.exit(0);
        }
        view.displayPoints(dao.getPoints() * 100);
        view.displayHash(dao.getHash());
    }

    public void stateQuestion() {
        view.stateQuestion(dao.getQuestion());
    }

    public void stateAnswerText() {
        view.stateAnswerText(dao.getAnswerText());
        dao.compareAnswer(view.stateAnswer());
    }
}

