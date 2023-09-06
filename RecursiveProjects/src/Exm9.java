public class Exm9 {

    // 9. kendisine parametre olarak gelen dizinşn simetrik olup olmadığını kontrol eden rekürsif fonksiyon

    public static boolean simetrikMi(int dizi[],int bas,int son,boolean kontrol){

        if (bas>=son)
            return kontrol;
        else
            if (dizi[bas]!=dizi[son])
                return false;
            else
                return simetrikMi(dizi,bas+1,son-1,kontrol);
    }

    public static void main(String[] args) {

        int dizi[]={1,2,2,1};
        System.out.println(simetrikMi(dizi,0,dizi.length-1,true));
    }
}
