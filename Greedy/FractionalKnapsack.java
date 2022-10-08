package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int [] val = {60,100,120};
        int [] weigh = {10,20,30};
        int w = 50;
        double ratio[][] = new double[val.length][2];
        for(int i = 0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weigh[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(O -> O[1]));
        int capacity = w;
        int max = 0;
        for(int i = ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weigh[idx]){
                    max+=val[idx];
                    capacity-=weigh[idx];
            }
            else{
                max+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(max);
    }
}
