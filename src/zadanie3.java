import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);



        System.out.println("podaj swoja wage");
        int bodymass = wpis.nextInt();
        System.out.println("podaj swoj wzrost");
        double height = wpis.nextDouble();

        double bmi;
        bmi = (double) bodymass / Math.pow((double) height, 2);
        if (bmi > 25) {
            System.out.println("Masz nadwagę.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Waga optymalna");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę");
        }
    }
}
