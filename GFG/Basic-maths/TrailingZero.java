import java.util.Scanner;

public class TrailingZero {
    public static  void main(String[] args0){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number to count its Factorial trailing zero");
        n= sc.nextInt();
        System.out.println("The number of Zero are : "+countTrailingZero(n));
    }
    static int countTrailingZero(int n){
        int res=0;
        for (int i = 5; i <=n ; i*=5)
            res=res+n/i;
            return res;
    }
}