package questions;

public class TrueFalseStudio extends QuestionStudio {
    public TrueFalseStudio(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "True or False: " + newLine +
                getQuestion() + newLine +
                getFormattedChoices();
    }

}
