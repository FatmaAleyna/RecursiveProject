import java.util.Arrays;

public class Exm17 {

    // 17. kendisine parametre olarak gelen sayısal dizinin her bir elmanını 1 artırıp geri döndüren rekürsif

    public static int [] birArtir(int dizi[],int indis){

        if (indis== dizi.length)
            return dizi;
        else
            dizi[indis]=dizi[indis]+1;
        return birArtir(dizi,indis+1);
    }

    public static void main(String[] args) {

        int dizi[]={1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(birArtir(dizi,0)));
    }
}
