package com.srihita.ques2.processor.output;

import com.srihita.ques2.processor.input.Node;

public class STOutputProcessor {

    public static Node prevNode = null;
    public static Node headNode = null;

    public void convertBSTtoST(Node node) {
        if (node == null) {
            return;
        }

        convertBSTtoST(node.getLeftNode());

        if (headNode == null) {
            headNode = node;
        } else {
            prevNode.setRightNode(node);
        }
        node.setLeftNode(null);
        prevNode = node;

        convertBSTtoST(node.getRightNode());
    }

    public void printST(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getNodeData() + " ");
        printST(node.getRightNode());
    }
}
