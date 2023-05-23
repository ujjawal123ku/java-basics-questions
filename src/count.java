import java.util.Scanner;
public class count {
    static int count(int n){

    if(n>=0&&n<=9){
        return 1;}
        else{
            return count(n/10)+1;

        }

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int n= input.nextInt();
        int m=count(n);
        System.out.println(m);

    }

}
