public class MATRIX {
//O(n^2)
    public static int Mat4(int[][] Mat) {
        int max = 0;

        int HelpMat[][] = new int[Mat.length][Mat.length];
        for (int i = 0; i < Mat.length; i++) {//the first shora
            Mat[0][i] = HelpMat[0][i];
        }
        for (int i = 0; i < Mat.length; i++) {//the first shora
            Mat[i][0] = HelpMat[i][0];
        }
        for (int i = 1; i < Mat.length; i++) {
            for (int j = 1; j < HelpMat.length; j++) {
                if (Mat[i][j] == 1) {
                    HelpMat[i][j] = (Math.min(HelpMat[i - 1][j - 1], Math.min(HelpMat[i - 1][j], HelpMat[i][j - 1]))) + 1;
                    if (HelpMat[i][j] > max) {
                        max = HelpMat[i][j];
                    }
                }
                else{
                    HelpMat[i][j]=Mat[i][j];
                }
            }
        }
        return max;

    }

        public static void main (String[]args){
            int[][] mat =
                    {{0, 0, 1, 0, 1},
                    {0, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1}
                    };
            System.out.println(Mat4(mat));
        }

}
