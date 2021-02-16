public class MinMax {
    //o(n) and the number of hashvaot is 1.5 n
    public static void MaxMin(int []arr){
        int max=0,min=0;
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }
        else{
            min=arr[0];
            max=arr[1];
        }
        for(int i=2;i<arr.length;i=i+2){
           if(arr[i]>arr[i+1]){
               if(arr[i]>max){
                   max=arr[i];
               }
               else if(arr[i+1]<min){
                   min=arr[i+1];
               }
           }
           else{
               if(arr[i+1]>max){
                   max=arr[i+1];
               }
               else if(arr[i]<min)min=arr[i];

            }
        }
        if((arr.length)%2!=0){// e zoge
            if(arr[arr.length-1]>max){
                max=arr[arr.length-1];
            }
            if(arr[arr.length-1]<min) {
                min = arr[arr.length - 1];
            }
        }
        System.out.println("the max is:" +max+ " --> the min is:" +min);
    }

    public static void main(String[] args) {
        int []arr={1,2,5,8,4,6,9,4,855,2};
        MaxMin( (arr));
    }
}
