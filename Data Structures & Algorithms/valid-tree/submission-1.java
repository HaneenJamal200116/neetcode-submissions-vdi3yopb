class Solution {
    public boolean validTree(int n, int[][] edges) {
        // check if cycle ? false : true
        // check if connected ? true : false
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        if (dfs(0, visited, -1, map)) {
            return false;
        }

        return visited.size() == n;
    }
    public boolean dfs(
        int node, HashSet<Integer> visited, int parent, HashMap<Integer, List<Integer>> map) {
        visited.add(node);
        for (int nei : map.get(node)) {
            if (!visited.contains(nei)) {
                if (dfs(nei, visited, node, map))
                    return true;

            } else if (nei != parent)
                return true;
        }
        return false;
    }
}