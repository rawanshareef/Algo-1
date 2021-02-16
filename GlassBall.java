public class GlassBall {

	 //* Worst Case sqrt 2n
        public static void Mesholashem(int a, int arr[]) {
            int k = 1;
            int numFloor=arr.length;
            while(numFloor>k*(k+1)/2) {
                k++;
            }
            int know=k;//הקומה שבה אנחנו נמצאים
            int FloorsUnder=k-1;//מספר הקומות שלא נשבר בהם הכדור
            while (arr[know] <=a) {
                know=know+FloorsUnder;
                FloorsUnder--;
            }
            System.out.println("the first ball break "+know);
            int Floor=know-(FloorsUnder+1);
            while(arr[Floor]<=a) {
                Floor++;
            }
            System.out.println("the Seconde Ball is Broking "+ Floor);
        }
     //if b=2 מספר כדורים 2
    	// * Worst Case O(n^2)

    public static int numberofcheacking2(int n) {
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        for (int i = 3; i <= n; i++) {
            int min = n;
            for (int j = 1; j < i-1; j++) {
                int x = Math.max(j, f[i-j]+1);
                if (x < min) min = x;
            }
            f[i] = min;
        }
        return f[n];
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9,10};
        Mesholashem(8,a);
    }

}
