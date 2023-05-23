import java.util.Scanner;
public class seriessum {
   static int sum(int n){
        if(n==0){
           // System.out.println(1);
            return 0;
        }
        else{
            int ans = n+sum(n-1);
            //System.out.println(ans);
            return ans;

        }
    }
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
        System.out.println(sum(n));

    }
}
