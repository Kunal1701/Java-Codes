
public class countNodes {
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

        public int count(node root) {
            if (root == null)
                return 0;

            int left = count(root.left);
            int right = count(root.right);
            return left + right + 1;
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        node root = tree.buildTree(nodes);
        System.out.print(tree.count(root));

        System.out.println();

    }
}