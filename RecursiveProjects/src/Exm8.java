public class Exm8 {

    // 8. kendisine parametre olarak gelen tam sayı dizisinin küçükten büyüğe doğru dıralı olup olmadığını kontrol eden rekürsif fonk

    public static boolean siraliMi(int dizi[],int indis,boolean kontrol){

        if (indis==dizi.length-1)
            return kontrol;

        else
            if (dizi[indis+1]>dizi[indis])
                kontrol=true;
            else
                kontrol=false;
                return siraliMi(dizi,indis+1,kontrol);
    }

    public static void main(String[] args) {

        int dizi[]={1,2,31,44,1};
        boolean kontrol=true;

        System.out.println(siraliMi(dizi,0,kontrol));
    }
}
