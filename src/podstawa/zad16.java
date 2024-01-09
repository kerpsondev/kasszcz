package podstawa;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Jakie jest twoje ulubione miasto? ");
        String ulubionemiasto=wpis.nextLine();
        System.out.println(ulubionemiasto.length());
        System.out.println(ulubionemiasto.toLowerCase());
        System.out.println(ulubionemiasto.toUpperCase());
        char pierwszalitera = ulubionemiasto.charAt(0);
        System.out.println(ulubionemiasto.charAt(0));
    }
}
