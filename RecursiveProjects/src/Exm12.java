import java.util.Arrays;

public class Exm12 {

    // 12. kendisine parametre olarak gelen diziyi ters çeviren rekürsif fonksiyon

    public static int[] tersDondur(int dizi[],int bas,int son,int yedek){

        if (bas>=son)
            return dizi;
        else
            yedek=dizi[son];
            dizi[son]=dizi[bas];
            dizi[bas]=yedek;
        return tersDondur(dizi,bas+1,son-1,yedek);
    }

    public static void main(String[] args) {

        int dizi[]={1,2,3,4,5};
        System.out.println(Arrays.toString(tersDondur(dizi,0, dizi.length-1, 0)));
    }
}
