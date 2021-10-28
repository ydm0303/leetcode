package doi.ydm.code;

/**
 * @ClassName Main1014
 * @Description TODO
 * @Author YDM
 * @Date 2021/10/14 20:02
 **/
public class Main1014 {
    public int[] max_sub_matrix (int[][] matrix) {
        // write code here
        int n=matrix.length;
        if(n==0)
            return new int[0];
        int m = matrix[0].length;

        int[][] s=new int[n+1][m+1];

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                s[i][j]=s[i-1][j] + s[i][j -1] - s[i-1][j-1]+matrix[i-1][j-1];

            }

        }
        int[] res = new int[4];
        int sum = matrix[0][0];

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                int start = 0;
                for (int k = 1; k < m + 1; k++) {
                    int cur = s[i][k]-s[j][k]-s[i][start]+s[j][start];
                    if(cur>sum){
                        sum=cur;
                        res=new int[]{sum,start,j,i-1,k-1};
                    }
                    if(cur<0){
                        start=k;
                    }


                }


            }

        }
        return res;

    }
}
