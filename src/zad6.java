import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("podaj liczbę sekund: ");
        double czas = wpis.nextDouble();
        double minuta = 0;
        double godzina = 0;
        double dni = 0;
        double sekundy = 0;if(czas>=86400){
            dni=czas/86400;
        }
        else if(czas<=3600){
            godzina=czas/3600;
        }
        else if(czas<=60){
            minuta=czas/60;
        }
        else sekundy=czas;

        System.out.println(czas + "sekund to " + dni +"dni "+godzina+"godzin "+ minuta+"minut");
    }
}
