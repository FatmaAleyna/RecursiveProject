public class ExmExtra16 {

    // 16. knedisine parametre olarak gelen stringte küçük harfleri büyük büyük harfleri küçük yapan rekürsif fonksiyon

    public static String kucukBuyuk(String str,int indis) {

        if (indis == str.length())
            return "";

        else {
            if (str.charAt(indis) >= 'a' && str.charAt(indis) <= 'z')
                return (char) (str.charAt(indis) - 32) + kucukBuyuk(str, indis + 1);
            else
                if (str.charAt(indis)>='A' && str.charAt(indis)<='Z' )
            return (char)(str.charAt(indis)+32) + kucukBuyuk(str, indis + 1);
                else
                    return str.charAt(indis)+kucukBuyuk(str,indis+1);
        }
    }
    public static void main(String[] args) {

        String str="FAtma";

        System.out.println(kucukBuyuk(str,0));
    }
}
