import java.util.*;

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

public class BinaryTreeLevelOrderTraversal
{

    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            levels.add(level);
        }

        return levels;
    }

    public static void main(String[] args)
    {
        BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = tree.levelOrder(root);
        for (List<Integer> level : result)
        {
            System.out.println(level);
        }
    }
}