import java.util.ArrayList;
import java.util.List;

public class SubsequenceByRecursion {
    public static void func(int i,List<Integer> list,int []arr){
            if(i>=arr.length){
                System.out.println(list);
                return;
            }
            list.add(arr[i]);
            func(i+1,list,arr);
            list.remove(arr[i]);
            func(i+1, list, arr);
    }
    public static void main(String []args)
    {
        int []arr={3,1,2};
        List<Integer>list = new ArrayList<>();
        func(0,list,arr);
    }
}
