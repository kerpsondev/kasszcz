import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner wpis = new Scanner(System.in);

        System.out.println("Podaj masę obiektu: ");
        double masaobiektu= wpis.nextDouble();

        double ciezar= masaobiektu*9.8;

        if(ciezar>1000){
            System.out.println("Obiekt jest zbyt ciężki");
        }
        else if (ciezar<10){
            System.out.println("Obiekt jest zbyt lekki");
        }
        else if(ciezar > 10 && ciezar<1000){
            System.out.println("ok");
        }

    }
}
