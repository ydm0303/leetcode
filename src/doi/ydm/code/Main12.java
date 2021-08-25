package doi.ydm.code;

/**
 * @ClassName Main12
 * @Description TODO
 * @Author YDM
 * @Date 2021/8/25 22:01
 **/
public class Main12 {
    public long maxWater (int[] arr) {
        // write code here
        if(arr.length < 3){
            return 0;
        }else{
            int filedWater = 0;
            int leftWall;
            int rightWall = arr[arr.length-1];
            int k = 0;
            int i ,j;
            int canwater = 0;
            for (i = arr.length-2; i >0 ; i--) {
                for (j = 0; j < i; j++) {
                    if(arr[j] > arr[k]){
                        k=j;
                    }
                }
                leftWall =arr[k];
                rightWall=Math.max(rightWall,arr[i+1]);
                canwater=Math.min(leftWall,rightWall-arr[i]);
                filedWater+=canwater>0 ? canwater :0;
            }

        return filedWater;
        }


    }
}
