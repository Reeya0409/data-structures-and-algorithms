class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int job[][]=new int [difficulty.length][2];
        for(int i=0;i<difficulty.length;i++){
            job[i][0]=difficulty[i];
            job[i][1]=profit[i];
        }
        Arrays.sort(job, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(worker);
        int i=0;
        int total=0;
        int total_profit=0;
        for(int w:worker){
            while(i<job.length && job[i][0]<=w){
                total=Math.max(total,job[i][1]);
                i++;
            }
            total_profit=total_profit+total;
        }
        return total_profit;
    }
}