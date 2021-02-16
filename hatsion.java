public class hatsion {
    public static int h(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length-1&&i<64-1;i=i+2){
            if(arr[i]>arr[i+1]){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            else{
                if(max<arr[i+1]){
                    max=arr[i+1];
                }
            }
        }
       return max;
    }
}
