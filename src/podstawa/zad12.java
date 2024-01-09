package podstawa;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);

        System.out.println("przejechane kilometry: ");
        double kilometry= wpis.nextDouble();

        System.out.println("litry paliwa: ");
        double litrypaliwa= wpis.nextDouble();

        System.out.println("liczba kilometrów przejechanych na litrze paliwa: "+ kilometry/litrypaliwa);
    }
}
