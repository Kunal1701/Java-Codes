import java.util.ArrayList;

public class lowestCommonAncestor {
    static class node {
        int val;
        node left;
        node right;

        node(int d) {
            this.val = d;
            this.left = this.right = null;
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
        int n1 = 4,n2=7;
        System.out.println(lca(root,n1,n2).val);
        
    }

    private static node lca(lowestCommonAncestor.node root, int n1, int n2) {
        ArrayList<node>path1 = new ArrayList<>();
        ArrayList<node>path2 = new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i))
            break;
        }
        node lca = path1.get(i-1);
        return lca;
    }

    private static boolean getPath(lowestCommonAncestor.node root, int n, ArrayList<lowestCommonAncestor.node> path) {
        if(root==null)
        return false;
        path.add(root);
        if(root.val==n)
        return true;
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft||foundRight)
        return true;
        path.remove(path.size()-1);
        return false;
    }
}
