public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // I did it so 10 questions are allowed
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of Italy?", new String[]{"Rome", "Paris", "London", "Berlin"}, 0));// Add what you want here
        quiz.addQuestion(new MultipleChoiceQuestion("How much % of the Earth surface is covered in water?", new String[]{"30%", "40%", "70%", "95%"}, 2));
        quiz.addQuestion(new MultipleChoiceQuestion("What do tourists in France want to try most often with coffe?", new String[]{"Croissant", "Cheesecake", "Apple Pie", "Cookies"}, 0));
        quiz.addQuestion(new MultipleChoiceQuestion( "Which mobile brand names their phones Galaxy?", new String[]{"Apple", "Samsung", "Oppo", "Xiaomi"}, 1));
        quiz.addQuestion(new MultipleChoiceQuestion( "What year did the first Shrek movie get released?", new String[]{ "1990", "1987", "2005", "2001"}, 3));
        quiz.addQuestion(new MultipleChoiceQuestion( "What is the name of the Gaming company behind the Granf Theft Auto Franchise", new String[]{ "Ubisoft", "Mojang", "Rockstar Games", "Rocksteady Games"},2));
        quiz.addQuestion(new MultipleChoiceQuestion( "What is the Biggest Contient on Eath?", new String[]{"Africa", "Asia", "Europe", "North America"}, 1));
        quiz.addQuestion(new MultipleChoiceQuestion( "Who is the largest Planet on Solar System?", new String[]{"Venus","Saturn","Jupiter","Earth"}, 2));
        quiz.addQuestion(new MultipleChoiceQuestion("What is the name of capital city of ALbania?", new String[]{"Elbasan","Shkora","Durres","Tirana"}, 3));
        quiz.addQuestion(new MultipleChoiceQuestion("Which company of behind half life franchise?", new String[]{"Ubisoft","Rockstar Games","Valve","CD Project Red"}, 2));

        quiz.display();
        quiz.showResult();
    }
}