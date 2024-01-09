package podstawa;

import java.util.Scanner;

public class zad11 {

    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);
        System.out.println("wpisz cene produtu: ");
        double wartoscProduktu = wpis.nextDouble();
        double podatekStanowy = wpis.nextDouble() / 0.02;
        double podatekLokalny = wpis.nextDouble() / 0.04;
        double cenaProduktu= wartoscProduktu - podatekStanowy - podatekLokalny;

        System.out.println("wartosc: " + wartoscProduktu);
        System.out.println("podatek stanowy: "+ podatekStanowy);
        System.out.println("podatek lokalny: "+podatekLokalny);
        System.out.println("cena całkowita: "+ wartoscProduktu + podatekLokalny + podatekStanowy);

    }
}
