package FindTheTownJudge;

/**
 * Create by 王鹏龙 on 2019-02-26 19:23
 */
public class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] num=new int[N+1];
        boolean[] flag=new boolean[N+1];
        for(int i=0;i<trust.length;i++){
            flag[trust[i][0]]=true;
            num[trust[i][1]]++;
        }
        for(int i=1;i<=N;i++){
            if(!flag[i]&&num[i]==N-1){
                return i;
            }
        }
        return -1;
    }
}
