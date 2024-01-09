package podstawa;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Wpisz wynik 1 testu ");
        int wynik1testu= wpis.nextInt();

        System.out.println("Wpisz wynik 2 testu ");
        int wynik2testu= wpis.nextInt();

        System.out.println("Wpisz wynik 3 testu ");
        int wynik3testu= wpis.nextInt();


        System.out.println("Podaj ilość testów: ");
                double ilosctestow=wpis.nextDouble();
                double srednia= wynik1testu + wynik2testu + wynik3testu;
                double srednia1= srednia/ilosctestow;

        System.out.println("Srednia z wszystkich testów: "+ srednia1 );

    }
}
