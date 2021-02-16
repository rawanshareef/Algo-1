import java.util.Stack;
//O(n)
//מספר השוואות n-1+log n
public class MaxMax {
        int num;
        Stack<Integer> s;

        public MaxMax(int num) {
            this.num = num;
            this.s = new Stack<Integer>();//stack empty
        }
    public static void theMax(int []a){
        MaxMax [] arrOfStack=new MaxMax[a.length];//array for all the nodes with stack
        for(int i=0;i<arrOfStack.length;i++) {
            arrOfStack[i] = new MaxMax(a[i]);
        }
        int theIndex=theMax1(arrOfStack,0,arrOfStack.length-1);//its the index of max1that have a stack for max2
        int max1=arrOfStack[theIndex].num;
        int max2=arrOfStack[theIndex].s.pop();
        while(!arrOfStack[theIndex].s.isEmpty()){
            int temp=arrOfStack[theIndex].s.pop();
            if(temp>max2){
                max2=temp;
            }
        }
        System.out.println(max1+","+max2);
    }
        public static int theMax1(MaxMax[]a,int low,int high){
            if(low<high) {
                int mid=(low+high)/2;
                int i=theMax1(a,low,mid);
                int j=theMax1(a,mid+1,high);
                int index=-1;
                if(a[i].num>a[j].num) {
                    a[i].s.push(a[j].num);
                    index=i;
                }else {
                    a[j].s.push(a[i].num);
                    index=j;
                }
                return index;
            }
            return low;
        }




        public static void main(String[] args) {
            int []arr={5,9,7,10,16,7,8};
            theMax(arr);
        }
    }
