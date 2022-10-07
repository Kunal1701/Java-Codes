import java.util.LinkedList;
import java.util.Queue;

public class tree {
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

        public void preorder(node root) {
            if (root == null)
                return;
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }

        public void postorder(node root) {
            if (root == null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
        public void levelorder(node root){
            if(root==null)
            return;
            Queue<node>q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                node curr = q.remove();
                if(curr==null){
                    if(q.isEmpty())
                    break;
                    else{
                    q.add(null);
                    System.out.println();
                    }
                }
                else{
                    System.out.print(curr.val+" ");
                    if(curr.left!=null)
                    q.add(curr.left);
                    if(curr.right!=null)
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        node root = tree.buildTree(nodes);
        // System.out.println(root.val);
        tree.levelorder(root);
        System.out.println();

    }
}