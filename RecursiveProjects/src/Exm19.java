public class Exm19 {

    // 19. kendisine parametre olarak gelen tam sayı dizisindeki pozitif tam sayıların toplamını geri döndüren rekürsif metof

    public static int toplamDondur(int dizi[],int toplam,int indis){

        if (indis==dizi.length)
            return toplam;

        else
            if (dizi[indis]>0)
                toplam=toplam+dizi[indis];
            return toplamDondur(dizi,toplam,indis+1);
    }

    public static void main(String[] args) {

        int dizi[]={1,2};

        System.out.println(toplamDondur(dizi,0,0));
    }
}
