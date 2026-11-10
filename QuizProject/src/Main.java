void main() {
    String questionText;
    String answer;
    String userInput;

    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to the Java's Quiz!");
    System.out.println("This Quiz will have multiple questions and question types.");

    QuestionGuess guess = new QuestionGuess();

    System.out.println("Here is the first Question:");
    questionText = guess.getQuestionText();
    System.out.println(questionText);
    System.out.print("Your answer: ");
    userInput = scan.next();
    answer = guess.getAnswer();
    if (userInput.equals(answer)) {
        System.out.println("You are Correct!");
    }
    else {
        System.out.println("You are wrong the answer was: " + answer);
    }
}