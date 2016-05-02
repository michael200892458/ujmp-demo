package com.liubin.test;

import org.ujmp.core.treematrix.DefaultTreeMatrix;
import org.ujmp.core.treematrix.TreeMatrix;

/**
 * Created by ThinkPad on 2016/5/2.
 */
public class TreeMatrixExample {
    public static void main(String[] args) {
        // create a TreeMatrix with Strings as elements
        TreeMatrix<String> treeMatrix = new DefaultTreeMatrix<String>();

        // create data
        treeMatrix.setRoot("root");
        treeMatrix.addChild("root", "child1");
        treeMatrix.addChild("root", "child2");
        treeMatrix.addChild("root", "child3");
        treeMatrix.addChild("child1", "subChild11");
        treeMatrix.addChild("child1", "subChild12");
        treeMatrix.addChild("child1", "subChild13");
        treeMatrix.addChild("child2", "subChild21");
        treeMatrix.addChild("child3", "subChild31");
        treeMatrix.addChild("child3", "subChild32");
        treeMatrix.addChild("subChild12", "subSubChild121");
        treeMatrix.addChild("subChild12", "subSubChild122");
        treeMatrix.addChild("subSubChild122", "subSubSubChild1221");

        // show on screen
        treeMatrix.showGUI();
    }
}
