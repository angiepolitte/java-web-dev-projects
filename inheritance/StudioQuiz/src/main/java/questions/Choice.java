package questions;

public class Choice {
    private final String content;
    private final boolean correct;

//    constructor

    public Choice(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }
    public Choice(String content) {
        this(content, false);
    }
//    getters

    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return correct;
    }
}
