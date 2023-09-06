public class Exm10 {

    //10. kendisine parametre olarak gelen dizide kaç tane pozitif sayı olduğunu bulan rekürsif fonksiyon

    public static int pozSayiBul(int dizi[],int indis,int sayac){

        if (indis== dizi.length)
            return sayac;
        else
            if (dizi[indis]>0)
                return pozSayiBul(dizi,indis+1,sayac+1);
            else
                return pozSayiBul(dizi,indis+1,sayac);
    }

    public static void main(String[] args) {

        int dizi[]={1,2,3,4};

        System.out.println(pozSayiBul(dizi,0,0));
    }
}
