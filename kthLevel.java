public class kthLevel {
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
        int k = 2;
        level(root,1,k);
    }

    private static void level(kthLevel.node root, int i, int k) {
        if(root==null)
        return;
        if(i==k){
            System.out.print(root.val+" ");
            return;
        }
        level(root.left, i+1, k);
        level(root.right, i+1, k);
    }
    
}
