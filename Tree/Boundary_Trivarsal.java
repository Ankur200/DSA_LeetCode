
    class Solution
    {
        
        public void leftNode(Node root,ArrayList<Integer> ans){
            Node curr=root.left;
            while(curr!=null){
                if(isLeaf(curr)==false){
                    ans.add(curr.data);
                }
                if(curr.left!=null) curr=curr.left;
                else{
                    curr=curr.right;
                }
            }
        }
        public void rightNode(Node root,ArrayList<Integer> ans){
            ArrayList<Integer> tmp=new ArrayList<>();
            Node curr=root.right;
            while(curr!=null){
                if(isLeaf(curr)==false) tmp.add(curr.data);
                if(curr.right!=null) curr=curr.right;
                else{
                    curr=curr.left;
                }
            }
            for(int i=tmp.size()-1;i>=0;i--){
                ans.add(tmp.get(i));
            }
        }
        public void addLeaf(Node root,ArrayList<Integer> ans){
            if(isLeaf(root)==true) {
                ans.add(root.data);
                return;
                }
            if(root.left!=null) addLeaf(root.left,ans);
            if(root.right!=null) addLeaf(root.right,ans);
            
        }
        public boolean isLeaf(Node root){
            return root.left==null && root.right==null;
        }
        ArrayList <Integer> boundary(Node node)
        {
            ArrayList<Integer> ans=new ArrayList<>();
            if(isLeaf(node)==false){
                ans.add(node.data);
            }
            leftNode(node,ans);
            addLeaf(node,ans);
            rightNode(node,ans);
            return ans;
        }
    }
    