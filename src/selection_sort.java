import java.util.Scanner;

public class selection_sort {
    public  static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int i,j,temp;
        System.out.println("enter numbers");
        for (i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        for(i=0;i<n-1;i++){
            int min=i;
            for(j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                  min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("sorted array");
        for (int k:arr
             ) {
            System.out.println(k);
            
        }
    }
    
}
