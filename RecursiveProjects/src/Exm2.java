public class Exm2 {

    // 2. kendisine parametre olarak gelen pozitif tam sayıya kadar olan sayıların toplamını bulan rekürsif fonksiyon

    public static int topla(int sayi){


        if (sayi==0)
        return 0;
        else
            return sayi+topla(sayi-1);
    }

    public static void main(String[] args) {

        System.out.println(topla(10));
    }
}
