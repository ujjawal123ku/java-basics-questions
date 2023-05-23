import java.util.Scanner;
public class gcd {
    static int iigcd(int x,int y){
        while (y==0){
            return y;

        }
        return igcd(y,x%y);
    }
    static int igcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;


        }
        return y;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(igcd(x,y));
        System.out.println(iigcd(x,y));
    }
}
