package BST;

import java.util.ArrayList;

public class Root2Leaf {

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

    public static void toPath(node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        list.add(root.data);
        if (root.left == null && root.right == null)
            printpath(list);
        toPath(root.left, list);
        toPath(root.right, list);
        list.remove(list.size() - 1);

    }

    private static void printpath(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + "->");
        System.out.println("Null");
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 7, 8, 9, 6 };
        node root = null;
        for (int i = 0; i < arr.length; i++)
            root = create(arr[i], root);
        toPath(root, new ArrayList<>());

    }
}
