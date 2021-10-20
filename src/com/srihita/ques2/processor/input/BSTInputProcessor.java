package com.srihita.ques2.processor.input;

public class BSTInputProcessor {

    private Node root;

    public Node getBSTRoot(){
        return root;
    }

    public void createBST() {
        root = new Node(50);
        root.setLeftNode(new Node(30));
        root.setRightNode(new Node(60));
        root.getLeftNode().setLeftNode(new Node(10));
        root.getRightNode().setLeftNode(new Node(40));
    }
}