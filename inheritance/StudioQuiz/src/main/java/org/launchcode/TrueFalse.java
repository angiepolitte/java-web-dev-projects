package org.launchcode;

import org.w3c.dom.ls.LSOutput;

public class TrueFalse extends Question {

//    variables
    private boolean options;

    public TrueFalse(String correctAnswers,
                     int points,
                     String userInput,
                     String text,
                     int questionNumber,
                     String wrongAnswers,
                     boolean options) {
        super(correctAnswers, points, userInput, text, questionNumber, wrongAnswers);
        this.options = options;
    }
//    constructor

    public TrueFalse(boolean options) {
        this.options = options;
    }

    public TrueFalse() {

    }


//    getter and setter


    public boolean isOptions() {
        return options;
    }

    public void setOptions(boolean options) {
        this.options = options;
    }
//    method


}
