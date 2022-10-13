package BST;

class node {
    int data;
    node left;
    node right;

    node(int d) {
        data = d;
    }
}

public class PrintInRange {
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

    public static void PrintInRange(node root, int k1, int k2) {
        if (root == null)
            return;
        if (root.data >= k1 && root.data <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        } else if (root.data < k1)
            PrintInRange(root.left, k1, k2);
        else
            PrintInRange(root.right, k1, k2);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 7, 8, 9, 6 };
        node root = null;
        for (int i = 0; i < arr.length; i++)
            root = create(arr[i], root);
        PrintInRange(root, 5, 8);
    }
}
