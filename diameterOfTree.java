public class diameterOfTree {
    static class node {
        int val;
        node left;
        node right;

        node(int d) {
            this.val = d;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        int i = -1;

        public node buildTree(int[] arr) {
            i++;
            if (arr[i] == -1) {
                return null;
            }
            node newNode = new node(arr[i]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }

        public int height(node root){
            if(root==null)
            return 0;
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left, right)+1;
        }
        public int diameter(node root){
            if(root==null)
            return 0;
            int ldia = diameter(root.left);
            int lh = height(root.left);
            int rdia = diameter(root.right);
            int rh = height(root.right);
            int selfdia = lh+rh+1;
            return Math.max(selfdia, Math.max(ldia, rdia));
        }
        
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        node root = tree.buildTree(nodes);
        System.out.print(tree.diameter(root));
      
        System.out.println();

    }
}
