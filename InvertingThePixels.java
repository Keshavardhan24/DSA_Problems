

public class InvertingThePixels
{
    public int[][] flipAndInvertImage(int[][] image)
    {
        int n = image.length;

        for (int i = 0; i < n; i++)
        {
            int start = 0;
            int end = n - 1;

            while (start <= end)
            {
                // Flip the pixels horizontally
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                // Invert the bits using the ~ operator and & 1 to ensure binary result
                image[i][start] = (~image[i][start]) &1;
                image[i][end] = (~image[i][end])&1 ;

                start++;
                end--;
            }
        }

        return image;
    }

    public static void main(String[] args)
    {
        InvertingThePixels solution = new InvertingThePixels();
        int[][] image =
        {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        int[][] result = solution.flipAndInvertImage(image);
        for (int[] row : result)
        {
            for (int pixel : row)
            {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}