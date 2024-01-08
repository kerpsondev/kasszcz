import java.util.Scanner;

public class zad13 {

    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);
        int pudełko = 40;
        int porcje = 10;
        int jednaporcja = 300;
        System.out.println("ilość zjedzonych ciasteczek :" );
       double zjedzoneciasteczka = wpis.nextDouble();
       int jednociastko = 75;
       double kalorie = jednociastko * zjedzoneciasteczka;
        System.out.println("skonsumowane kalorie: "+ kalorie);


    }
}
