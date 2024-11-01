
import java.util.ArrayList;
import java.util.Scanner;

class Quiz {
    private final ArrayList<Question> questions;
    private int points;
    private final String[] result;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.points = 0;
        this.result = new String[]{"You are a genius!", "You did well!", "You need to study more!"};
    }

    public void addQuestion(Question question) {
        if (questions.size() < 10) {
            questions.add(question);
        } else {
            System.out.println("Quiz already has 10 questions. Cannot add more.");
        }
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            question.display();
            System.out.print("Enter your answer: ");
            String answer = scanner.nextLine();

            if (question.check(answer)) {
                points++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
            System.out.println();
        }
        scanner.close();
    }

    public void showResult() {
        System.out.println("You scored " + points + " out of " + questions.size());
        if (points == questions.size()) {
            System.out.println(result[0]);
        } else if (points > questions.size() / 2) {
            System.out.println(result[1]);
        } else {
            System.out.println(result[2]);
        }
    }
}

