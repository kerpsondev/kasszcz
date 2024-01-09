package podstawa;

import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        double Kwotapolatach;
        System.out.println("Wpisz cene zdeponowana: ");
        double kwotapierwotna = wpis.nextDouble();
        System.out.println("Wpisz roczną stopę oprocentowania: ");
        double stopaoprocentowania = wpis.nextDouble();
        System.out.println("Wpisz ile lat będą środki realizowane: ");
        double odsetki = wpis.nextDouble();
        System.out.println("Wpisz liczbę lat przez jakie bedzie kwota deponowana: ");
        double liczbalat= wpis.nextDouble();
        double kwota1=1+stopaoprocentowania/odsetki;
        double kwota2= kwotapierwotna+kwota1;

        System.out.println("Bedziesz posiadac "+ kwota2+ " po "+ liczbalat + "latach.");

    }
}
