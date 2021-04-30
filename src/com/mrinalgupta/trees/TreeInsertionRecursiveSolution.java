package com.mrinalgupta.trees;

public class TreeInsertionRecursiveSolution {
    public TreeNode insertIntoBST(TreeNode root,int value){
//        check if root node exist or not,
//        if not then create root node with value and return it as answer
        if(root == null){
            return new TreeNode(value);
        }
        // if the root node exists compare its value to the value to be added
        // if the value is smaller, take the left child node as root node
        // if the value is greater take right node as root node and call the insert function again
        // continue the process until you find the right place to insert the value
        if(root.value > value){
            root.left = insertIntoBST(root.left, value);
        }else{
            root.right = insertIntoBST(root.right, value);
        }
        return root;
    }

}
