import java.util.Scanner;

public class FillInQuestions {

    static Scanner sc = new Scanner(System.in);

    public static void question1(){
        System.out.print("What is the mascot of the university of Toledo?: ");

        String[] correctAnswer = {"The Rockets", "Rockets", "the rockets", "rockets"};
        String answer = sc.next();

        //figure out how to get scanner to read the space in between "The" and "Rockets"
        if (answer.equals(correctAnswer[0]) || answer.equals(correctAnswer[1])|| answer.equals(correctAnswer[3])) {
            System.out.println("Correct!");
            Controller.points = Controller.points + 1;
        } else {
            System.out.println("Wrong Answer!");
        }

    }

    public static void question2(){
        System.out.print("What year was George Washington elected president: ");

        int[] correctAnswer = {1789};
        int answer = sc.nextInt();

        if (answer == (correctAnswer[0])) {
            System.out.println("Correct!");
            Controller.points = Controller.points + 1;
        } else {
            System.out.println("Wrong Answer!");
        }

    }

    public static void question3(){
        System.out.print("What is the answer to this? ((20 - 15) + (5 (5 - 3) - 1)) : ");

        int correctAnswer = 14;
        int answer = sc.nextInt();

        if (answer == (correctAnswer)) {
            System.out.println("Correct!");
            Controller.points = Controller.points + 1;
        } else {
            System.out.println("Wrong Answer!");
        }

    }

    public static void question4(){
        System.out.print("What is the first element of the periodic table?: ");

        String[] correctAnswer = {"Hydrogen", "hydrogen"};
        String answer = sc.next();

        if (answer.equals(correctAnswer[0]) || answer.equals(correctAnswer[1])) {
            System.out.println("Correct!");
            Controller.points = Controller.points + 1;
        } else {
            System.out.println("Wrong Answer!");
        }

    }

    public static void question5(){
        System.out.print("What is the capital city of Spain?: ");

        String[] correctAnswer = {"Madrid", "madrid"};
        String answer = sc.next();

        if (answer.equals(correctAnswer[0]) || answer.equals(correctAnswer[1])) {
            System.out.println("Correct!");
            Controller.points = Controller.points + 1;
        } else {
            System.out.println("Wrong Answer!");
        }

    }

    public static void question6(){

    }

    public static void question7(){

    }

    public static void question8(){

    }

    public static void question9(){

    }

    public static void question10(){

    }
}
