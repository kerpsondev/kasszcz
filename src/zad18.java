public class zad18 {
    public static void main(String[] args) {
        double prowizja= 0.02;
        double cenaakcji= 21.77;
        double iloscakcji = 600;
        double akcjabezprowizji= 21.77*0.2 ;
        double akcjabezp=akcjabezprowizji*600;
        double wysokoscprowizji= 600*21.77;
        double cos= wysokoscprowizji*0.02;
        double cenazpodatkiem= cos+wysokoscprowizji;
        double tak = akcjabezp+wysokoscprowizji*prowizja;

        System.out.println("Kwota akcji bez prowizji: "+ akcjabezprowizji*600);
        System.out.println("Wysokość prowizji: "+ wysokoscprowizji*prowizja);
        System.out.println("Łączna kwota: "+ tak);
    }
}
