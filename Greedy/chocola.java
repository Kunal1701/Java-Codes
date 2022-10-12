package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class chocola {
    public static void main(String[] args) {
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] >= costVer[v]) {
                cost += vp * costHor[h];
                h++;
                hp++;
            } else {
                cost += hp * costVer[v];
                v++;
                vp++;
            }
        }
        while (h < costHor.length) {
            cost += vp * costHor[h];
            h++;
            hp++;
        }
        while (v < costVer.length) {
            cost += hp * costVer[v];
            v++;
            vp++;
        }
        System.out.println(cost);
    }
}
