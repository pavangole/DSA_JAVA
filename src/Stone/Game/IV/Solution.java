package Stone.Game.IV;
public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.winnerSquareGame(5));
    }

    public boolean winnerSquareGame(int n) {
        Boolean[] memo = new Boolean[n + 1];
        return helper(n, memo);
    }

    private boolean helper(int n, Boolean[] memo){
        if(n == 0) return false;
        if(memo[n] != null) return memo[n];
        boolean canWin = false;
        for(int i = (int)(Math.sqrt(n)); i >= 1; i--){
            if(!helper(n - i * i, memo)){
                canWin = true;
                break;
            }
        }
        return memo[n] = canWin;
    }
}

