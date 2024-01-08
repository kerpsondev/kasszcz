public class zad22 {
    public static void main(String[] args) {
        double wartoscakcji = 32.87*1000;
        double wartoscprowizji = wartoscakcji * 0.02;
        double wartoscakcjipo= 33.92*1000;
        double wartoscprowizjipo= wartoscakcjipo * 0.02;
        double zysk= wartoscakcjipo - wartoscakcji - wartoscprowizjipo - wartoscprowizji;
        System.out.println("Zysk wynosi: "+zysk);
    }
}
