package com.srihita.ques2.processor.input;

public class Node {
    private int nodeData;
    private Node left;
    private Node right;

    public Node(int data) {
        nodeData = data;
        left = null;
        right = null;
    }

    public int getNodeData() {
        return nodeData;
    }

    public void setNodeData(int nodeData) {
        this.nodeData = nodeData;
    }

    public Node getLeftNode() {
        return left;
    }

    public void setLeftNode(Node left) {
        this.left = left;
    }

    public Node getRightNode() {
        return right;
    }

    public void setRightNode(Node right) {
        this.right = right;
    }
}

