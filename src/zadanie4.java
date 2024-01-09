import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Podaj pierwszy wynik");
        int wynik1 = wpis.nextInt();
        System.out.println("Podaj drugi wynik");
        int wynik2 = wpis.nextInt();
        System.out.println("Podaj trzeci wynik");
        int wynik3 = wpis.nextInt();
        int ilosc = 3;

        double srednia = (wynik1 + wynik2 + wynik3) / ilosc;

        if (srednia < 60) {
            System.out.println(" 1 ");
            if (srednia <= 60) {
                System.out.println(" 2 ");
                if (srednia >= 60 && srednia <= 69) {
                    System.out.println(" 3 ");
                    if (srednia >= 70 && srednia <= 79) {
                        System.out.println(" 4 ");
                        if (srednia >= 80 && srednia <= 89) {
                            System.out.println(" 5 ");
                            if (srednia >= 90 && srednia <= 100) {
                                System.out.println(" 6 ");
                            }
                        }
                    }
                }
            }
        }
    }
}
