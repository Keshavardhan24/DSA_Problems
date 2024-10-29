import java.util.*;
import java.util.Stack;



public class ZigZag
{

    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reverse = new Stack<>();
            for (int i = 0; i < size; i++)
            {
                TreeNode node = queue.poll();

                // Check flag
                if (flag)
                    reverse.add(node.val);
                else
                    level.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            flag = !flag;

            // Pop all elements from stack
            while (!reverse.isEmpty())
                level.add(reverse.pop());

            levels.add(level);
        }

        return levels;
    }

    public static void main(String[] args)
    {
        ZigZag tree = new ZigZag();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = tree.zigzagLevelOrder(root);
        for (List<Integer> level : result)
        {
            System.out.println(level);
        }
    }
}