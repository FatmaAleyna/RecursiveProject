public class Exm1 {

    // 1. kendisine parametre olarak gelen sayının faktöriyelini hesaplayan rekürsif fonksiyon


    public static int faktoriyelHesapla(int sayi){


        if (sayi==0 || sayi==1)
            return 1;
        else
            return sayi*faktoriyelHesapla(sayi-1);
    }


    public static void main(String[] args) {
        System.out.println(faktoriyelHesapla(4));
    }
}