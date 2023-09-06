public class Exm15 {

    // 15. kendisine parametre olarak gelen bir tamsayı dizisindeki en büyük elamanı geri döndüren rekürsif fonksiyon

    public static int enbE( int dizi[],int enb,int indis){

        if (indis==dizi.length)
        return enb;

        else
            if (dizi[indis]>enb)
                enb=dizi[indis];
            return enbE(dizi,enb,indis+1);
    }

    public static void main(String[] args) {

        int dizi[]={1,2,37,4};

        System.out.println(enbE(dizi,dizi[0],0));
    }
}
