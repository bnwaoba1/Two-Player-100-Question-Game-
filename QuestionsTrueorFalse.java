import java.util.Scanner;


    public class QuestionsTrueorFalse {

        static Scanner sc = new Scanner(System.in);

        /**
         * Question #1 -------------------------------------------------------------------------------------------
         */
        public static void question1(){
            System.out.println("True or False?");
            System.out.print("Ash Ketchum's first pokemon was Charmander: ");

            boolean answer = sc.nextBoolean();

            if (answer) {
                System.out.println("Incorrect!");
            } else {
                Controller.points = Controller.points + 1;
            }
        }

        /**
         * Question #2 --------------------------------------------------------------------------------------------
         */
        public static void question2(){
            System.out.println("True or False?");
            System.out.print("Is Cloud a character from Final Fantasy VII?: ");

            boolean answer = sc.nextBoolean();

            if (answer){
                Controller.points = Controller.points + 1;
            } else {
                System.out.println("Incorrect!");
            }
        }

        /**
         * Question #3 --------------------------------------------------------------------------------------------
         */
        public static void question3(){
            System.out.println("True or False?");
            System.out.print("Donald Trump is the 44th president: ");

            boolean answer = sc.nextBoolean();

            if (answer) {
                System.out.println("Incorrect - Barrack Obama");
            } else {
                Controller.points = Controller.points + 1;
            }
        }

        /**
         * Question #4 ------------------------------------------------------------------------------------------
         */
        public static void question4(){
            System.out.println("True or False?");
            System.out.print("There are 51 states in the United states of America: ");

            boolean answer = sc.nextBoolean();

            if (answer) {
                System.out.println("Incorrect - You need some help");
            } else {
                Controller.points = Controller.points + 1;
            }
        }

        /**
         * Question #5 -------------------------------------------------------------------------------------------
         */
        public static void question5(){
            System.out.println("True or False?");
            System.out.print("Google owns the rights to Youtube: ");

            boolean answer = sc.nextBoolean();

            if (answer) {
                Controller.points = Controller.points + 1;
            } else {
                System.out.println("Incorrect");
            }
        }

        /**
         * Question #6 -------------------------------------------------------------------------------------------
         */
        public static void question6(){

        }

        /**
         * Question #7 -------------------------------------------------------------------------------------------
         */
        public static void question7(){

        }

        /**
         * Question #8 -------------------------------------------------------------------------------------------
         */
        public static void question8(){

        }

        /**
         * Question #9 -------------------------------------------------------------------------------------------
         */
        public static void question9(){

        }

        /**
         * Question #10 -------------------------------------------------------------------------------------------
         */
        public static void question10(){

        }

    }

