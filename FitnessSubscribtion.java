import java.util.Scanner;

public class FitnessSubscribtion {
    public static void main(String[] args) {
        new FitnessSubscribtion().run () ;

    }
    public void run () {
        Scanner in = new Scanner(System.in);

        System.out.println("Student discount is: " + calculateStudentDiscountt());
        System.out.println("Senior discount is: " + calcSeniorPrice());
        System.out.println("If youre both a Student and a senior the price is "); // ved ikke lige hvordan vi skal calculate det, om vi skal gøre det separat i en anden metode.

        ;
    }
    public double calculateStudentDiscountt () {

        double subscribtionPrice = 300;
     double studentDiscount = subscribtionPrice *0.6;
     return  studentDiscount;
    }
    public double calcSeniorPrice () {
        double subscribtionPrice = 300;
        double seniorPrice = subscribtionPrice *0.8;
        return seniorPrice;
    }
    public double calcThreeMonthsDiscount () {
        double subscribtionPrice = 300;
        double threeMonths = subscribtionPrice *0.95;
        return threeMonths;
    }

}
