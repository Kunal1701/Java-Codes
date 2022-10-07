
public class lowestCommonAncestor2 {
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
        int n1 = 6, n2 = 7;
        System.out.println(lca(root, n1, n2).val);

    }

    private static node lca(node root, int n1, int n2) {
        if (root == null || root.val == n1 || root.val == n2)
            return root;
        node leftlca = lca(root.left, n1, n2);
        node rightlca = lca(root.right, n1, n2);
        if (leftlca == null)
            return rightlca;
        if (rightlca == null)
            return leftlca;
        return root;
    }

}
