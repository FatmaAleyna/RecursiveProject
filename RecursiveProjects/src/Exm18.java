public class Exm18 {

    // 18. kendisine parametre olarak gelen stringteki boşlukları silen rekürsif fonksiyon

    public static String boslukSil(String str,int indis){

        if (indis==str.length())
            return "";
        else
            if (str.charAt(indis)!=' ')
                return str.charAt(indis)+boslukSil(str,indis+1);
            return boslukSil(str,indis+1);
    }

    public static void main(String[] args) {

        String str="abc hede hödö";

        System.out.println(boslukSil(str,0));
    }
}
