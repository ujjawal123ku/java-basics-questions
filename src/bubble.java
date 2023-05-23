import java.util.Scanner;
public class bubble {
    public static void main(String args []){
        int j,k,temp;
      Scanner sc=new Scanner(System.in);
        System.out.println("taking input");
        int m= sc.nextInt();
        int arr[]=new int[m];
        for (int i=0;i<m;i++){
            arr[i]= sc.nextInt();
        }
        for(j=0;j<m-1;j++){
            for(k=0;k<m-j-1;k++){
                if(arr[k]<arr[k+1]){
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        for (int i=0;i<m;i++){
            System.out.println(arr[i]);
        }
    }
}
