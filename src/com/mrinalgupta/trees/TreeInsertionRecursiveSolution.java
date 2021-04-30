package com.mrinalgupta.trees;

public class TreeInsertionRecursiveSolution {
    public TreeNode insertIntoBST(TreeNode root,int value){
        if(root == null){
            return new TreeNode(value);
        }
        if(root.value > value){
            root.left = insertIntoBST(root.left, value);
        }else{
            root.right = insertIntoBST(root.right, value);
        }
        return root;
    }

}
