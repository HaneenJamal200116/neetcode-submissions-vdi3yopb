/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        if (root == null)
            return "null";
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                res.append("null").append('#');
            } else {
                res.append(curr.val).append('#');
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String vals[]=data.split("#");
        if(vals[0].equals("null"))return null;
        TreeNode root=new TreeNode(Integer.parseInt(vals[0]));
         Queue<TreeNode> q = new LinkedList<>();
         q.offer(root);
         int i=1;
         while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(!vals[i].equals("null")){
                curr.left=new TreeNode(Integer.parseInt(vals[i]));
                q.offer(curr.left);
            }
            i++;
            if(!vals[i].equals("null")){
                curr.right=new TreeNode(Integer.parseInt(vals[i]));
                q.offer(curr.right);
            }
            i++;
            
         }
         return root;

    }
}
