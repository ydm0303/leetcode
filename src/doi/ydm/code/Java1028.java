package doi.ydm.code;

import javax.swing.tree.TreeNode;
import java.util.Stack;

/**
 * @ClassName Java1028
 * @Description TODO
 * @Author YDM
 * @Date 2021/10/28 19:39
 **/
public class Java1028 {
    public boolean chkMixture(String A, int n, String B, int m, String C, int v) {
        // write code here
        if(n+m!=v) return false;
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;:

        for (int i = 1; i <=n ; i++) {
            if(A.charAt(i-1)==C.charAt(i-1)){
                dp[i][0] =true;

            }else break;
        }
        for (int j = 1; j <= m ; j++) {
            if(B.charAt(j-1)==C.charAt(j-1)){
                dp[0][j]=true;
            }else break;
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                dp[i][j]=(A.charAt(i-1)==C.charAt(i+j-1)&&dp[i-1][j]||(B.charAt(j-1)==C.charAt(i+j-1)&&dp[i][j-1]));
            }
        }
    return dp[n][m];
    }
}
