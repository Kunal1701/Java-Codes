package BST;

class node {
    int data;
    node left;
    node right;

    node(int d) {
        data = d;
    }
}

public class BST {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 7, 8, 9, 6 };
        node root = null;
        for (int i = 0; i < arr.length; i++)
            root = create(arr[i], root);
        inorder(root);
        int key = 10;
        System.out.println("\n"+search(root, key));

    }

    private static boolean search(node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        else if (root.data > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    private static void inorder(node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static node create(int val, node root) {
        if (root == null) {
            root = new node(val);
            return root;
        } else if (root.data > val) {
            root.left = create(val, root.left);
        } else if (root.data < val)
            root.right = create(val, root.right);
        return root;
    }
}
