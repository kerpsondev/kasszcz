import java.util.Scanner;

public class zad88 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
        System.out.println("pdaj ilosc pakietow  ");
        double pakiet = wpis.nextDouble();
        double cena = pakiet * 99;
        if (pakiet >= 10 && pakiet <= 19) {
            double rabat = cena * 0.2;
            double cena1 = cena - rabat;
            System.out.println("promocja -20%  " + rabat);
            System.out.println("cena po rabacie  " + cena1);
        }
        if (pakiet > 20 && pakiet < 49) {
            double rabat2 = cena * 0.3;
            double cena2 = cena - rabat2;
            System.out.println("promocja -30%  " + rabat2);
            System.out.println("cena po rabacie  " + cena2);

        }
        if (pakiet > 50 && pakiet < 99) {
            double rabat3 = cena * 0.4;
            double cena3 = cena - rabat3;
            System.out.println("promocja -40%  " + rabat3);
            System.out.println("cena po rabacie  " + cena3);

        }
        if (pakiet > 100) {
            double rabat4 = cena * 0.5;
            double cena4 = cena - rabat4;
            System.out.println("promocja -50%  " + rabat4);
            System.out.println("cena po rabacie  " + cena4);
        }
    }
}

