public class Donats {
        final int time=2;
        public static int dounates(int k){
            if(k%2==0){
                int x=k/2;
                return x*2;
            }
            else{
                int x2=(k-1)/2;
                x2=x2*2;
                return x2+1;
            }

        }

        public static void main(String[] args) {
            int k=4;
            System.out.println(dounates(k));
        }

    }