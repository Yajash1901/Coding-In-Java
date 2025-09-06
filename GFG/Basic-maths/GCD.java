import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers to find GCD : ");
        a=sc.nextInt();
        b=sc.nextInt();

        /*Naive solution
        int res=Math.min(a,b);
        while(res!=0)
        {
          if(a%res==0 && b%res==0)
          break;

          res--;
          }
        System.out.println("GCD : "+res);*/


        //Euclidean Algorithm
       /* while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("GCD : "+a);*/

        System.out.println("GCD : "+gcd(a,b));


    }
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else
        return gcd(b,a%b);
    }
}
