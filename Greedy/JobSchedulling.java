package Greedy;

import java.util.ArrayList;
import java.util.Collections;

class job {
    int id;
    int time;
    int profit;

    job(int i, int t, int p) {
        id = i;
        time = t;
        profit = p;
    }
}

public class JobSchedulling {
    public static void main(String[] args) {
        int jobs[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<job> list = new ArrayList<>();
        for (int i = 0; i < jobs.length; i++)
            list.add(new job(i, jobs[i][0], jobs[i][1]));
        Collections.sort(list, (a, b) -> b.profit - a.profit);// for descending based on profit
        int time = 0;
        int profit = 0;
        for (int i = 0; i < list.size(); i++) {
            if (time < list.get(i).time) {
                profit += list.get(i).profit;
                time++;
            }
        }
        System.out.println(profit);
    }
}
