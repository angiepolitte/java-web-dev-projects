package questions;

import org.launchcode.MultipleChoice;

public class MultipleChoiceStudio extends QuestionStudio {
    public MultipleChoiceStudio(String question, Choice[] choiceArray) {
       super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "Choose One: " + newLine +
                getQuestion() + newLine +
                getFormattedChoices();
    }
}
