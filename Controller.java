import java.util.*;

public class Controller extends Questions {

    public static boolean team1;
    public static boolean team2;
    public static int points = 0;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Questions.question1(true);
        System.out.println(points);
    }


}
