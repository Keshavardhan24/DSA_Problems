import java.util.List;
public class CountIslands
{
    public static void main(String[] args)
    {
        List<List<Character>> grid = List.of(
            List.of('1', '0', '0', '0', '0'),
            List.of('0', '1', '0', '1', '0'),
            List.of('0', '0', '1', '0', '0'),
            List.of('0', '0', '0', '1', '0'),
            List.of('1', '0', '0', '0', '1')
        );
        System.out.println(countIslands(grid));  
    }
    public static int countIslands(List<List<Character>> grid)
    {
        int count = 0;
        int rows = grid.size();
        int cols = grid.get(0).size();
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < cols; j++)
             {
                if (grid.get(i).get(j) == '1' && !visited[i][j]) 
                {
                    dfs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(List<List<Character>> grid, int i, int j, boolean[][] visited) 
    {
        int rows = grid.size();
        int cols = grid.get(0).size();

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid.get(i).get(j) == '0' || visited[i][j]) 
        {
            return;
        }

        visited[i][j] = true;

        dfs(grid, i + 1, j, visited);
        dfs(grid, i - 1, j, visited);
        dfs(grid, i, j + 1, visited);
        dfs(grid, i, j - 1, visited);
    }
}