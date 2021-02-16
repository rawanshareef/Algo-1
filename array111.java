public class array111 {
    public static int array(int arr[]){
        int count=0;
        int count2=0;
        int help[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                help[i]=0;
                count=0;
            }
           else if(i>0&&arr[i]==1){
               count=help[i-1]+1;
               help[i]=count;
               if(count>count2){
                   count2=count;
               }
            }
        }

        return count2;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,0,1,1};
        int x=array(arr);
        System.out.println(x);
    }
}
