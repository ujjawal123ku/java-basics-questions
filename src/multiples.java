public class multiples {
    static void mul(int i,int j){
        if (j==1){
            System.out.println(i);
            return ;
        }
        //else{
            mul(i,j-1);
        System.out.println(i*j);
            return ;
       // }
    }
    public static void main(String[] args){
       // int j=4;
        //int m;
        //for( m=0;m< j; m ++){
        mul(3,4);
    }
           // }
}
