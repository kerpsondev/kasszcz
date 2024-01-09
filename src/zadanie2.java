import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Podaj dzień: ");
        int day = wpis.nextInt();

        System.out.println("Podaj miesiąc (w formie liczby): ");
        int month = wpis.nextInt();

        System.out.println("Podaj ostatnie 2 cyfry roku: ");
        int year= wpis.nextInt();

        if(day * month == year)
            System.out.println("data jest magiczna");
        else
            System.out.println("data nie jest magiczna");

    }
}
