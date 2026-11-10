public class Question {
    private String questionText;
    private String answer;

    public Question() {
        questionText = "How many states in the US?";
        answer = "50";
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }
    public String getAnswer() {
        return answer;
    }
}
