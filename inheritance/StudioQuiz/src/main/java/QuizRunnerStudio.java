import questions.*;

public class QuizRunnerStudio {
//    create Quiz
    private static final QuizStudio quiz = new QuizStudio();

    public static void main(String[] args) {
//        create questions
        String q1 = "Which of the following are books by Jane Austen?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Jane Eyre"),
                new Choice("Pride and Prejudice", true),
                new Choice("Wives and Daughters"),
                new Choice("Mansfield Park", true)
        };
        CheckBoxStudio question1 = new CheckBoxStudio(q1, q1Choices);

        String q2 = "The most published author of all time is Agatha Christie.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueFalseStudio question2 = new TrueFalseStudio(q2, q2Choices);

        String q3 = "Which poem did history-making poet Amanda Gorman recite at the U.S. presidential inauguration in 2021?";
        Choice[] q3Choices = new Choice[] {
                new Choice("The Hill We Climb", true),
                new Choice("The Miracle of Morning"),
                new Choice("We Rise"),
                new Choice("New Day's Lyric")
        };
        MultipleChoiceStudio question3 = new MultipleChoiceStudio(q3, q3Choices);

//        add questions to list
        quiz.addQuestions(new QuestionStudio[]{question1, question2, question3});

//        interact with user, give score
        quiz.run();

        String newLine = System.lineSeparator();
        System.out.println(newLine + "You answered " + quiz.getNumCorrect() + " of " + quiz.getQuestions().size() + " questions correctly. Thanks for playing!" + newLine);

    }
}
