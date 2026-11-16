class Solution {
    public int countComponents(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        int cnt = 0;
        for (int node : map.keySet()) {
            if (dfs(node,set,map))
                cnt++;
        }
        return cnt;
    }
    public boolean dfs(int node,HashSet<Integer>set,HashMap<Integer, List<Integer>> map) {
        if (set.contains(node))
            return false;
        set.add(node);
        for(int nei:map.get(node)){
            dfs(nei,set,map);
        }
        return true;
    }
}
