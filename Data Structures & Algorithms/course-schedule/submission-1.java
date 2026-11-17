class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> restack = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            map.get(edge[1]).add(edge[0]);
        }
        for (int node : map.keySet()) {
            if (dfs(node, visited, map, restack))

                return false;
        }
        return true;
    }
    public boolean dfs(int node, HashSet<Integer> visited, HashMap<Integer,List<Integer>> map,
        HashSet<Integer> restack) {
        if (restack.contains(node))
            return true;
        if (visited.contains(node))
            return false;
        visited.add(node);
        restack.add(node);
        for (int nei : map.get(node)) {
            if (dfs(nei, visited, map, restack))
                return true;
        }
        restack.remove(node);
        return false;
    }
}
