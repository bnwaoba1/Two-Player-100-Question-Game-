import java.util.*;
//By: Brian Nwaobasi
public class Controller {

    public static boolean team1;
    public static boolean team2;
    public static int points = 0;

    /**
     * Set of questions containing true or false questions
     */
    public static void QuestionsTrueOrFalse(){

        QuestionsTrueorFalse.question1();
        System.out.println("Points = " + points);

        QuestionsTrueorFalse.question2();
        System.out.println("Points = " + points);

        QuestionsTrueorFalse.question3();
        System.out.println("Points = " + points);

        QuestionsTrueorFalse.question4();
        System.out.println("Points = " + points);

        QuestionsTrueorFalse.question5();
        System.out.println("Points = " + points);
    }

    /**
     * Set of questions containing fill in the blank questions
     */
    public static void fillInQuestions(){

        FillInQuestions.question1();
        System.out.println("Points = " + points);

        FillInQuestions.question2();
        System.out.println("Points = " + points);

        FillInQuestions.question3();
        System.out.println("Points = " + points);

        FillInQuestions.question4();
        System.out.println("Points = " + points);

        FillInQuestions.question5();
        System.out.println("Points = " + points);

    }

    /**
     * Runs my code :)
     */
    public static void main(String[] args) {

         QuestionsTrueOrFalse();
         fillInQuestions();


    }


}
