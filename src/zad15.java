import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("podaj cene detaliczna : ");
        double cenadetaliczna = wpis.nextDouble();
        double marza = 0.4;

        double zysk = cenadetaliczna * marza;
        System.out.println("Zysk : "+zysk )  ;

    }
}
