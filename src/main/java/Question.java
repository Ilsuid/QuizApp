//THis class annoyyeeddd me to the coreee haahahaha
class Question {
    private final String text;
    private final String[] options;
    private final int correctAnswer;

    public Question(String text, String[] options, int correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
//
    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void display() {
        System.out.println(text);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean check(String answer) {
        try {
            int selectedOption = Integer.parseInt(answer);
            return selectedOption == correctAnswer;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
