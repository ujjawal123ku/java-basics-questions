import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double p,i, bmi;

        System.out.println("enter ur weight in pounds");
        p=input.nextDouble();
       double w= p*0.45359237;
        System.out.println("enter ur height in inch");
       i=input.nextDouble();
        double h=i * 0.0254 ;
        //
         bmi=w/(h*h);
        System.out.println("value of bmi ="+bmi);


    }

}
