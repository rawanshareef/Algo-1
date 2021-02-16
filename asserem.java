public class asserem {
//The Lamp Is ON
public static int Hanena(int n){
    boolean aserrem[]=new boolean[n];
    for(int i=0;i< aserrem.length;i++){
        aserrem[i]=false;
    }
    int lamp=1;//on
    int count=0;
    int natseg=0;
    while(count<n) {
        int personRandom = (int) (Math.random() * n);
        if (personRandom == natseg) {
            if (aserrem[personRandom] == false) {
                ;//its a first time that entered
                aserrem[personRandom] = true;
                count++;
            } else {
                if (lamp == 0) {//enterd some one
                    count++;
                    lamp = 1;
                }
            }
        } else {//if it is not natseeg
            if (aserrem[personRandom] == false) {
                lamp = 0;
                aserrem[personRandom] = true;
                count++;
            }

        }

    }
    return count;
}
//The Lamp Is Unknown
public static boolean Prisoners(int n) {
int []enter=new int[n];
    for(int i=0;i< enter.length;i++){
        enter[i]=0;
    }
    int count=0;
    int natseg=0;
    boolean lamp=(int)(Math.random()*2)==0 ?  false:true;
while(count<2*n){
    int personRandom = (int) (Math.random() * n);
    if(personRandom==natseg&&!lamp){
        lamp=true;
        count++;
        if(enter[natseg]==0){
            enter[natseg]++;
            count++;
        }
    }
    else{
        if(enter[personRandom]<2&&lamp){
            enter[personRandom]++;
            lamp=false;
        }

    }
}
    boolean answer=true;
for(int i=0;i<enter.length&&answer;i++){
    if(enter[i]==0){
        answer=false;
    }
}
return answer;
}

    public static void main(String[] args) {
        int n=5;
        System.out.println(Hanena(n));
        System.out.println(Prisoners(n));

    }
}
