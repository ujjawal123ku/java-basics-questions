import java.util.Scanner;
public class Factorial {
    static int fact(int a){
        if(a==0) return 1;
       int ans=a*fact(a-1);
       return ans;
    }
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number");
        int a=input.nextInt();
        System.out.println(fact(a));


        
    }
}
