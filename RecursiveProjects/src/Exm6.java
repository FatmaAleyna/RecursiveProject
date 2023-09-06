public class Exm6 {

    // 6. kendisine parametre olarak gelen n. fibonacchi sayısını hesaplayan rekürsif fonksiyonu yazınız

    public static int fibonacchi(int n){

        if (n==0 || n==1)
            return 1;
        else
            return fibonacchi(n-2)+fibonacchi(n-1);
    }

    public static void main(String[] args) {

        System.out.println(fibonacchi(4));
    }
}
