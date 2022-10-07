import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class topViewTree {
    static class node {
        int val;
        node left;
        node right;

        node(int d) {
            this.val = d;
            this.left = this.right = null;
        }
    }
    static class Info{
        int htd;
        node nd;
        Info(int htd,node nd){
            this.htd = htd;
            this.nd = nd;
        }
    }
    public static void view(node root){
        int min=0,max=0;
        Queue<Info>q = new LinkedList<>();
        HashMap<Integer,node>map = new HashMap<>();
        q.add(new Info(0, root));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr==null){
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }
            else{
                if(!map.containsKey(curr.htd))
                map.put(curr.htd, curr.nd);
                if(curr.nd.left!=null){
                    q.add(new Info(curr.htd-1, curr.nd.left));
                    min = Math.min(min, curr.htd-1);
                }
                if(curr.nd.right!=null){
                    q.add(new Info(curr.htd+1, curr.nd.right));
                    max = Math.max(max, curr.htd+1);
                }
               
            }
            
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).val+" ");
        }
    }
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        view(root);
        System.out.println();
    }
}
