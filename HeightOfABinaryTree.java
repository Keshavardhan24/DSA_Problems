import java.util.LinkedList;
import java.util.Queue;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x)
    {
        val = x;
        left = null;
        right = null;
    }
}

public class HeightOfABinaryTree
{

    public int height(TreeNode root)
     {
        if (root == null) return -1; // If tree is empty, height is -1

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int height = -1;

        while (!queue.isEmpty())
        {
            int size = queue.size();
            if (size == 0)
            {
                return height;
            }

            while (size > 0)
            {
                TreeNode node = queue.poll();
                if (node.left != null)
                {
                    queue.add(node.left);
                }
                if (node.right != null)
                {
                    queue.add(node.right);
                }
                size--;
            }

            height++;
        }
        return height;
    }

    public static void main(String[] args)
    {
        HeightOfABinaryTree tree = new HeightOfABinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int height = tree.height(root);
        System.out.println("Height of the binary tree is: " + height);
    }
}