package com.mrinalgupta.trees;

public class TreeInsertionNonRecursive {
    public TreeNode insertIntoBST(TreeNode root, int value){
        if(root == null)return new TreeNode(value);

        TreeNode currentNode = root;

        while(true){
            if(currentNode.value <= value){
                if(currentNode.right != null){
                    currentNode = currentNode.right;
                }else{
                    currentNode.right = new TreeNode(value);
                    break;
                }

            }else{
                if(currentNode.left != null){
                    currentNode = currentNode.left;
                }else{
                    currentNode.left = new TreeNode(value);
                    break;
                }

            }
        }
        return root;
    }
}
