public class subtreeOfTree {
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
        //subtree
        node subtree = new node(2);
        subtree.left = new node(4);
        subtree.right = new node(5);
        boolean res =isSubtree(root,subtree);
        System.out.println(res);
    }
    private static boolean isSubtree(node root, node subtree) {
        if(root==null)
        return false;
        if(root.val == subtree.val){
            if(isIdentical(root,subtree)){
                return true;
            }
        }
        boolean left = isSubtree(root.left, subtree);
        boolean right = isSubtree(root.right, subtree);
        return left||right;
    }
    private static boolean isIdentical(node root,node subtree) {
        if(root==null && subtree==null)
        return true;
        else if(root==null || subtree==null || root.val!=subtree.val)
        return false;
        if(!isIdentical(root.left, subtree.left))
        return false;
        if(!isIdentical(root.right, subtree.right))
        return false;
        return true;
    }
}
