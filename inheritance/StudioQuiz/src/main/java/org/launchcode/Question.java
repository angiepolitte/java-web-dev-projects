package org.launchcode;

public abstract class Question {
//    variables

    private String correctAnswers;
    private int points;
//    answer
    private String userInput;
//    question
    private String text;
    private int questionNumber;
    private String wrongAnswers;
//constructor
    public Question(String correctAnswers,
                    int points,
                    String userInput,
                    String text,
                    int questionNumber,
                    String wrongAnswers) {
        this.correctAnswers = correctAnswers;
        this.points = points;
        this.userInput = userInput;
        this.text = text;
        this.questionNumber = questionNumber;
        this.wrongAnswers = wrongAnswers;
    }

    public Question() {

    }
//    getters and setters

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(String wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }


    //    method
 public int addingTwoNumbers(int a, int b) {
        return a +b;
 }
}
