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
        int key = 8;
        System.out.println("\n"+search(root, key));
        root = delete(root, key);
        inorder(root);

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
    private static node delete(node root,int val){
        if(root.data<val)
        root.right = delete(root.right, val);
        else if(root.data>val)
        root.left = delete(root.left, val);
        else{
            if(root.left==null && root.right==null)
            return null;
            
            if(root.right==null)
            return root.left;
            else if(root.left==null)
            return root.right;

            node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    private static node InorderSuccessor(node root) {
        while(root.left!=null)
        root = root.left;
        return root;
    }
}
