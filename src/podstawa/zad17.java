package podstawa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);

        System.out.println("Wprowadz cene posilku: ");
        double cenaposilku = wpis.nextDouble();

        double podatek = 0.0675;
        double napiwek1 = cenaposilku+podatek;
                double napiwek2 = napiwek1 * 0.2;
                double wartosc = cenaposilku-podatek;
                double podatek1 = cenaposilku*podatek ;
                double dozaplaty= cenaposilku+napiwek2+podatek1;
        System.out.println("Wartość produktu:  " + wartosc );
        System.out.println("Wysokość napiwku: " + napiwek2);
        System.out.println("Wartość podatku: "+ podatek1) ;
        System.out.println("Do zapłaty: "+ dozaplaty );
    }
}
