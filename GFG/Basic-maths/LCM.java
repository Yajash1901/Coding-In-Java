import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers to find LCM : ");
        a= sc.nextInt();
        b= sc.nextInt();
        
        /* NAIVE SOLUTION
        int res=Math.max(a,b);

        while(true){
            if(res%a==0 && res%b==0)
                break;
            else
                res++;
        }
        System.out.println("LCM : "+res);*/

        // a*b = gcd(a,b)*lcm(a,b)

        System.out.println("LCM : "+lcm(a,b));
    }

    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else
           return  gcd(b,a%b);
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
