package lab1.task5;

public class Main {
    public static void main(String[] args) {
        System.out.println(FindingSubsequence(new int[]{13, 51, 93, 91, 42, 36, 96, 37, 27, 18}));
    }

    public static int FindingSubsequence(int[] A) {
        int n = A.length;

        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
            }
        }
        return n - maxLen;
    }
}
