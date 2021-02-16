public class GameNmaberDENAME {
    //O(n^2)
    public static int[][] Mat(int[]arr ){
        int [][] Mat=new int[arr.length][arr.length] ;
        for(int i=0;i< arr.length;i++){
            Mat[i][i]=arr[i];
        }
        for (int i = Mat.length-2; i >= 0; i--) {
            for (int j =  i+1; j < Mat.length ; j++) {
                Mat[i][j]=Math.max(arr[i] - Mat[i+1][j],arr[j]-Mat[i][j-1]);
            }
        }
        return Mat;
    }
    public static int TheGame(int[]arr ){
      int Mat[][]=Mat(arr);
      int sumFirst=0;
      int sumSecond=0;
        int temp1=0,temp2=0;
        int i =0,j=arr.length-1;

        for (int k = 0; k < arr.length/2; k++) {
            if(arr[i]-Mat[i+1][j]>arr[j]-Mat[i][j-1]) {
                sumFirst+=arr[i];
                temp1=i++;
            }else {
                sumFirst+=arr[j];
                temp1=j--;
            }

            if(i!=j) {
                if(arr[i]-Mat[i+1][j]>arr[j]-Mat[i][j-1]) {
                    sumSecond+=arr[i];
                    temp2=i++;
                }else {
                    sumSecond+=arr[j];
                    temp2=j--;
                }
            }
            else {
                sumSecond+=arr[j];
                temp2=j;
            }
            System.out.println("The First One take index "+ temp1+
                    " The valiue :"+arr[temp1]+" The Second take index "+ temp2+
                    " The valiue :"+arr[temp2]);
        }
        return sumFirst-sumSecond;
    }
    public static void main(String[] args) {
        int[] a = {4,1,5,9};
        System.out.println(TheGame(a));

    }
    }
