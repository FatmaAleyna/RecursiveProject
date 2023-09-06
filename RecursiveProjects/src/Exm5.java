public class Exm5 {

    // 5. kendisine parametre olarak gelen sayı kadar adınızı ekrana yazan rekürsif fonksiyon

    public static String adYazma(String ad,int sayi){

        if (sayi==1)
            return ad;
        else
            return ad+" "+adYazma(ad,sayi-1);
    }

    public static void main(String[] args) {

        System.out.println(adYazma("fatma",4));
    }
}
