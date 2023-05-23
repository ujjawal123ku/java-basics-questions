import java.util.Scanner;
public class fibonacci {
    static int fib(int a){
      if(a==0) return 0;

        if(a==1) return 1;

        int ans=fib(a-1)+fib(a-2);
        return ans;
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number");
        int a=input.nextInt();
        int i;
        for ( i=0;i<=a;i++){
        System.out.println(fib(i));}

    }
}
