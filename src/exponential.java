public class exponential {
     static  int expo(int p,int q){
        if(q==0){
            return 1;
        }
        //else {
         //   int ans=expo(p, q-1);
           // return ans*p;
       // }
         else{
             int ans=expo(p, q/2);
             if(q%2==0){
                 return ans*ans;
             }
             else{
                 return ans*ans*p;
             }

        }

     }
    public static void main(String[] args){
        System.out.println(expo(5,3));
    }

}
