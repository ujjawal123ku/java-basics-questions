import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
public class sumofdigits {
    static int add(int n){
        if(n>=0&&n<=9){
            return  n;

        }
        else{
            return add(n/10)+n%10;
        }
    }

    public  static void main(String[] args){
        Scanner input=new Scanner(System.in) ;
        System.out.println("enter digits");
        int n=input.nextInt();
        int sum=add(n);
        System.out.println(sum);


    }
}
