public class Exm7 {

    // 7. kendisine parametre olarak gelen bir tam sayı dizisindeki en büyük elemanın indisini geri döndüren rekürsif fonksiyon

    public static int enBuyukIndis(int dizi[],int indis,int sayac){


        if (sayac==dizi.length)
            return indis;
        else
            if (dizi[sayac]>dizi[indis])
                indis=sayac;
            return enBuyukIndis(dizi,indis,sayac+1);
    }

    public static void main(String[] args) {

        int dizi[]={1009,21,3780,9899};

        System.out.println(enBuyukIndis(dizi,0,0));
    }
}
