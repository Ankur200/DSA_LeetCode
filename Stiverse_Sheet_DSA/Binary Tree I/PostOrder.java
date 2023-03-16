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
class Solution {
    public List<Integer> postorderTraversal(TreeNode node) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(node==null) return list;
        while(node!=null || !stack.isEmpty()){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                TreeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                  //  stack.pop();
                    list.add(temp.val);
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                       // stack.pop();
                        list.add(temp.val);                    }
                }else{
                    node=temp;
                }
            }
        }
        return list;
    }
}
