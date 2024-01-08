import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);
        System.out.println("Podaj liczbe ciastek: ");
        double Liczbaciastek= wpis.nextDouble();
        double lc=Liczbaciastek/48;
        double maka = 2.75 *lc;
        double cukier = 1.5 * lc;
        double maslo = 1* lc;
        System.out.println("Potrzebujesz: "+ maka +" mąki, "+ cukier +"  cukru, "+maslo + " masła. :)");
    }
}
