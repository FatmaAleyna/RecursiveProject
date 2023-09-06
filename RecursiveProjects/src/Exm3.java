public class Exm3 {

// 3. kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsif fonksiyon

    public static int basamakSayisi(int sayi,int basamak){

        if (sayi/10==0)
            return 1;
        else
            return basamak+basamakSayisi(sayi/10,basamak);
    }

    public static void main(String[] args) {

        System.out.println(basamakSayisi(9843,1));
    }
}
