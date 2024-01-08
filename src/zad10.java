import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("firstName ");
        String firstName = klawiatura.nextLine();
        klawiatura.nextLine();

        System.out.println("middleName ");
        String middleName = klawiatura.nextLine();
        klawiatura.nextLine();

        System.out.println("lastName ");
        String lastName = klawiatura.nextLine();
        klawiatura.nextLine();

        char initial = firstName.charAt(0);
        char initial2 = middleName.charAt(0);
        char initial3 = lastName.charAt(0);

        System.out.println("inicjały: ");
        System.out.println("imie "+ initial);
        System.out.println("drugie imie"+initial2);
        System.out.println("nazwisko "+ initial3);


    }
}
