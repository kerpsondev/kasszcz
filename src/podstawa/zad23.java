package podstawa;

import java.util.Scanner;

public class zad23 {

    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("długość rzędu: ");
        double dlugosc= wpis.nextDouble();
        System.out.println("podaj dlugosc miejsca zajmujacej kratki: ");
        double kratka= wpis.nextInt();
        System.out.println("Podaj odleglosc miedzy sadzonkami: ");
        double sadzonka1 = wpis.nextInt();
        double sadzonka = (dlugosc-2*kratka)/sadzonka1;
        System.out.println("W rzędzie zmiesci sie: "+ sadzonka + " sadzonek.");
    }
}
