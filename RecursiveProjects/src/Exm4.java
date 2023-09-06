public class Exm4 {

    // 4. kendisine parametre olarak gelen sayıların a^b sini hesaplayan rekürsif fonksiyon

    public static int usAlma(int taban,int us){

        if (us==1) // durma şartı
            return taban;
        else
            return taban*usAlma(taban,us-1);
    }

    public static void main(String[] args) {

        System.out.println(usAlma(7,2));
    }
}
