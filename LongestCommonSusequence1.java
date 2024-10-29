public class LongestCommonSusequence1 {
    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";
        
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; 
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); 
                }
            }
        }

        int lcsLength = dp[m][n];
        char[] lcsChars = new char[lcsLength]; 
        int i = m, j = n;
        int index = lcsLength - 1; 
        
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcsChars[index] = X.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        String lcs = new String(lcsChars);
        System.out.println("Length of Longest Common Subsequence: " + lcsLength);
        System.out.println("Longest Common Subsequence: " + lcs);
    }
}
