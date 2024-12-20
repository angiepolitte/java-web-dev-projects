package questions;

public class CheckBoxStudio extends QuestionStudio {
    public CheckBoxStudio(String question, Choice[] choiceArray) {
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "Choose One or More: " + newLine +
                getQuestion() + newLine +
                getFormattedChoices();
    }
    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
