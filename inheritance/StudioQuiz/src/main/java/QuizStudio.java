import questions.Choice;
import questions.QuestionStudio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizStudio {
    private final ArrayList<QuestionStudio> questions = new ArrayList<>();
    private int numCorrect = 0;

//    default constructor is sufficient

//getters
    public ArrayList<QuestionStudio> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }
//    method
    public void addQuestions(QuestionStudio[] questionArray) {
        Collections.addAll(questions, questionArray);
    }
    public void run() {
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        for (QuestionStudio question : questions) {

            //        print question for user
            System.out.println(question);

//            get and validate responses
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i < question.getMaxResponses()) {
                String userResponse;

//                validate
                do {
                    System.out.println("Please enter a number: ");
                    userResponse = input.nextLine();
                } while (question.isInvalid(userResponse));

//                evaluate
                int userResponseNum = Integer.parseInt(userResponse);
                if (userResponses.contains(userResponseNum)) {
                    System.out.println("You already got that one!");
                } else if (!question.getChoiceMap().get(userResponseNum).isCorrect()) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userResponseNum);
                    if (i == question.getMaxResponses() -1) {
                        numCorrect++;
                    }
                    i++;
                }

            }
        }

        input.close();

    }

}
