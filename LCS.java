public class LCS {
//O(a*b)
public static String Hamdani(String a,String b){
    String help="";
    int start=0;
    for(int i=0;i<a.length();i++){
        int index=b.indexOf(a.charAt(i),start);
        if(index>0 ){
            help=help+a.charAt(i);
            start=index+1;
        }
    }
    return help;

}
    public static String HamdaniMshopar(String a,String b){
    int arr []=new int[26];
        int start=0;
        String help="";
        for(int i=0;i<a.length();i++) {
            int index=a.charAt(i)-'a';
            arr[index ]++;
        }
        for(int i=0;i<b.length();i++) {
            int index2 = b.charAt(i) - 'a';
            if (arr[index2] > 0) {
                int index = a.indexOf(b.charAt(i), start);
                if (index > 0) {
                    help = help + b.charAt(i);
                    start = index + 1;
                    arr[index2]--;
                }
            }
        }
        return help;

}
//O(a*b) Its the BEST
    public static String Denamic(String a,String b){
        int[][] Mat=build(a,b);
        int Length = Mat[a.length()][b.length()];//the last index in Mmat
        String res = "";//save the String
        int i = a.length();
        int j =b.length();
        int count = Length;
        while (count > 0) {
            if (a.charAt(i-1) == b.charAt(j-1)) {//if the same latter
                res =res+ a.charAt(i-1) ;
                i--;
                j--;
                count--;
            }
            else {
                if (Mat[i][j] == Mat[i][j-1])
                    j--;
                else
                    i--;
            }
        }
        return res ;
    }

    public static int[][] build(String x,String y){
        int[][] Mat =new int[x.length()+1][y.length()+1];
        for(int i=0;i<y.length()+1;i++){
            Mat[0][i]=0;
        }
        for(int i=0;i<x.length()+1;i++){
                Mat[i][0]=0;
        }
        for(int i=1;i<x.length()+1;i++) {
            for (int j = 1; j < y.length()+1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    Mat[i][j] = Mat[i - 1][j - 1] + 1;
                } else {
                    Mat[i][j] = Math.max(Mat[i - 1][j],
                            Mat[i][j - 1]);
                }
            }
        }
		return Mat;

}

    public static void main(String[] args) {
            String X = "abcabbde";
            String	Y = "bdef";
            System.out.println(HamdaniMshopar(X,Y));
        }
    }


