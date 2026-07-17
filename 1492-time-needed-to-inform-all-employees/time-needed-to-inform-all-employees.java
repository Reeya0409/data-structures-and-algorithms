class Solution {
    int ans = 0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] tree = new ArrayList[n];
        for (int i = 0; i < n; i++)
            tree[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1)
                tree[manager[i]].add(i);
        }
        dfs(headID, 0, tree, informTime);
        return ans;
    }
    private void dfs(int node, int time, List<Integer>[] tree, int[] informTime) {
        ans = Math.max(ans, time);
        for (int child : tree[node]) {
            dfs(child, time + informTime[node], tree, informTime);
        }
    }
}