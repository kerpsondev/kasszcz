package podstawa;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
        int pokoj1;
        System.out.println("podaj długość pokoju nr1: " );
        int lenght = wpis.nextInt();
        System.out.println("podaj szerokość pokoju nr1: ");
        int width = wpis.nextInt();
        pokoj1 = lenght * width;
        wpis.nextLine();

        int pokoj2;
        System.out.println("podaj długość pokoju nr2: " );
        int lenght1 = wpis.nextInt();
        System.out.println("podaj szerokość pokoju nr2: ");
        int width1 = wpis.nextInt();
        pokoj2 = lenght * width;
        wpis.nextLine();

        int pokoj3;
        pokoj3=2*3;

        int pokoj4;
        pokoj4=2*2;

        int calepole= pokoj1+pokoj2+pokoj3+pokoj4;

        System.out.println("Wymiary 1 pokoju: "+ pokoj1);
        System.out.println("Wymiary 2 pokoju: "+ pokoj2);
        System.out.println("Wymiary 3 pokoju: "+ pokoj3);
        System.out.println("Wymiary 4 pokoju: "+ pokoj4);

    }
}
