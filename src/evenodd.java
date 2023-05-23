import java.util.Scanner;

public class evenodd {
    static int sum(int n){
        if (n==0){
            return 0;

        }
        else{
            if(n%2==0){
                return sum(n-1)-n;
            }
            else {
                return sum(n-1)+n;
            }
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(sum(n));

    }
}
