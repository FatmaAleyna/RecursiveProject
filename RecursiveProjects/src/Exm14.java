public class Exm14 {

    // 14. kendisine parametre olarak gelen stringin palindrom olup olmadığını kotrol eden rekürsif fonksiyonunu yazın

    public static boolean palindromMu(String str,int bas,int son,boolean kontrol){

        if (bas>son)
            return kontrol;
        else
            if (str.charAt(bas)!=str.charAt(son))
                kontrol=false;
                return palindromMu(str,bas+1,son-1,kontrol);
    }

    public static void main(String[] args) {

        String str="1321";

        System.out.println(palindromMu(str,0,str.length()-1,true));
    }
}
