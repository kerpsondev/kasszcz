import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("wpisz 1 imie");
        String imie1 = wpis.nextLine();
        System.out.println("wpisz 2 imie");
        String imie2 = wpis.nextLine();
        System.out.println("wpisz 3 imie");
        String imie3 = wpis.nextLine();

        if (imie1.compareToIgnoreCase(imie2) < 0 && imie2.compareToIgnoreCase(imie3) < 0); {
            System.out.println(imie1+imie2+imie3);
        }
        ///(imie2.compareToIgnoreCase(imie1)<0 && imie1.compareToIgnoreCase(imie3)<0);{
            System.out.println(imie2+imie1+imie3);
        }
        {

        }
    }
