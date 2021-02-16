public class Power {
    //O(log n)
public static double PowerRecorsia(double x,int power){
if(power==0)
    return 1;
if(power%2==0){//is Even
    return PowerRecorsia(x*x,power/2) ;
}
else{//if not Even
    return x*PowerRecorsia(x*x,(power-1)/2);

}

}
    public static double PowerLooP(double x,int power) {
    double res=1;
    while(power!=0){
        if(power%2!=0 ){
            res=res*x;
        }
        x=x*x;
        power=power/2;
    }
    return res;
    }

    public static void main(String[] args) {
        System.out.println(PowerLooP(2,3) );
    }
}
