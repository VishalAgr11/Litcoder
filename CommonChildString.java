import java.util.Scanner;

public class CommonChildString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.next();
        String s2 = in.next();

        int result = commonChild(s1, s2);
        System.out.println(result);
    }

    private static int commonChild(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}
