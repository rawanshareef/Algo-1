public class rekorsiaAndEndoktsea {
public static int factorial(int n){
   if(n==0)return 1;
    return factorial(n-1)*n;
}
    public static int fibumachi(int n){
    int x1=1,x2=1,x3=0;
    for(int i=3;i<=n;i++){
        x3=x1+x2;
        x1=x2;
        x2=x3;
    }
    return x3;
    }


    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n) );
        System.out.println(fibumachi(6) );

    }



}
