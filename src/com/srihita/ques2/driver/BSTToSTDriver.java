package com.srihita.ques2.driver;

import com.srihita.ques2.processor.input.BSTInputProcessor;
import com.srihita.ques2.processor.output.STOutputProcessor;

public class BSTToSTDriver {
    public static void main(String[] args) {
        BSTInputProcessor bst = new BSTInputProcessor();
        bst.createBST();
        STOutputProcessor st = new STOutputProcessor();
        st.convertBSTtoST(bst.getBSTRoot());
        st.printST(STOutputProcessor.headNode);
    }
}
