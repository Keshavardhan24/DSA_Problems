
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val)
    {
        this.val = val;
    }
}

class Solution
{
    public TreeNode insertIntoBST(TreeNode root, int val)
    {
        if (root == null)
        {
            return new TreeNode(val);
        }
        if (val < root.val)
        {
            root.left = insertIntoBST(root.left, val);
        }
        else
        {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}

public class BinarySearchTree
{
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println("Original BST:");
        printTree(root);
        Solution solution = new Solution();
        root = solution.insertIntoBST(root, 5);
        System.out.println("\nBST after inserting node with value 5:");
        printTree(root);
    }

    public static void printTree(TreeNode root)
    {
        if (root != null)
        {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }
}
