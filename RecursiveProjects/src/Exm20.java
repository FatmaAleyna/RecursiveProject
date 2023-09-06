public class Exm20 {

    // 20. sayının basamaklarının toplamını bulan reküsif fonlsiyon

    public static int basamakToplami(int sayi){

        if (sayi==0)
            return 0;
        else
            return sayi%10+basamakToplami(sayi/10);
    }


    public static void main(String[] args) {

        System.out.println(basamakToplami(1993));
    }
}
