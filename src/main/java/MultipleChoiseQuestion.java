

class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(String text, String[] options, int correctAnswer) {
        super(text, options, correctAnswer);
    }

    @Override
    public void display() {
        System.out.println(getText());
        for (int i = 0; i < getOptions().length; i++) {
            System.out.println((char) (i + 65) + ". " + getOptions()[i]);
        }
    }

    @Override
    public boolean check(String answer) {
        return answer.length() == 1 && answer.toUpperCase().charAt(0) == (char) (getCorrectAnswer() + 65);
    }
}
