public class MaxInArray {
    //O(n)
    static int Max(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
              if(arr[i]>max)
                  max=arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr={2,5,8,93,6,4,2,4};
        System.out.println(Max(arr));
    }
}
