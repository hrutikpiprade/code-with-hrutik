class Solution {
    int [][] dp;
    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        return solve(0, 0, s1, s2);
    }
    int solve(int i, int j, String s1, String s2){
        int sum = 0;
        if(i>=s1.length()){
            for(int k=j ; k<s2.length(); k++) sum+=s2.charAt(k);
            return sum;
        }
        if(j>=s2.length()){
            for(int k=i; k<s1.length(); k++) sum += s1.charAt(k);
            return sum;
        }

        if(dp[i][j]!=0) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)) return solve(i+1, j+1, s1, s2);

        int delete1 = s1.charAt(i) + solve(i+1, j, s1, s2);
        int delete2 = s2.charAt(j) + solve(i, j+1, s1, s2);

        return dp[i][j] = Math.min(delete1, delete2);
        
    }
}