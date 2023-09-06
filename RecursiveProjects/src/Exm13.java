public class Exm13 {

    // 13. kendisine parametre olarak gelen stringi ters döndüren rekürsif fonksiyon

    public static String stringDondur(String str,String bos,int i){

         if (i<0)
           return bos;
       else
           bos=bos+str.charAt(i);
           return  stringDondur(str,bos,i-1);
    }

    public static void main(String[] args) {

        String str="fatma";
        System.out.println(stringDondur(str,"", str.length()-1));
    }
}
