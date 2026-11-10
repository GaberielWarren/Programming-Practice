import controller.QuizProjectController;
import dao.QuizProjectDao;
import view.*;

void main() {

    QuizProjectUI ui = new QuizProjectUI();
    QuizProjectView view = new QuizProjectView(ui);
    QuizProjectDao dao = new QuizProjectDao();
    QuizProjectController controller = new QuizProjectController(view, dao);

    controller.start();
}