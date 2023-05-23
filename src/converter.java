import java.util.Scanner;
public class converter {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double m,f;
        System.out.println("enter value in meter");
        m= input.nextDouble();
        f=m*3.28084;
        System.out.println("value of meter in feet="+f);
    }
}
