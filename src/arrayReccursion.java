public class arrayReccursion {
    static void printArray(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr ,idx+1);
    }
    public static void main( String[] args){
        int[] arr={5,6,3,2,5,3,2,5,67,43};
        printArray(arr,5);
    }
}
