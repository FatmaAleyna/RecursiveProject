public class Exm11 {

    // 11. kendisine parametre olarak gelen dizide kaç tane küçük karakter vardır sayısını geri döndüren rekürsif fonksiyon
    // MÜTHİŞ ÖRNEK AMA BEN ANLAMADIM

    public static int kucukKarSayisi(String dizi[],int diziIndex,int kelimeIndex){

        if (diziIndex==dizi.length)
            return 0;
        else
            if (kelimeIndex==dizi[diziIndex].length())
        return kucukKarSayisi(dizi,diziIndex+1,0);
            else
                if (dizi[diziIndex].charAt(kelimeIndex)>='a' && dizi[diziIndex].charAt(kelimeIndex)<='z')
                    return 1+kucukKarSayisi(dizi,diziIndex,kelimeIndex+1);
                else
                    return kucukKarSayisi(dizi,diziIndex,kelimeIndex+1);
    }

    public static void main(String[] args) {

        String dizi[]={"23a","23b"};
        System.out.println(kucukKarSayisi(dizi,0,0));
    }
}
