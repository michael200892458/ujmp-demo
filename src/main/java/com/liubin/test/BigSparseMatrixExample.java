package com.liubin.test;
import org.ujmp.core.Matrix;
import org.ujmp.core.SparseMatrix;
import org.ujmp.core.util.MathUtil;

/**
 * Created by ThinkPad on 2016/5/2.
 */
public class BigSparseMatrixExample {
    public static void main(String[] args) {
        // create a very large sparse matrix
        SparseMatrix m1 = SparseMatrix.Factory.zeros(100, 500);

        // set some values
        m1.setAsDouble(MathUtil.nextGaussian(), 0, 0);
        m1.setAsDouble(MathUtil.nextGaussian(), 1, 1);
        for (int i = 0; i < 1000; i++) {
            m1.setAsDouble(MathUtil.nextGaussian(), MathUtil.nextInteger(0, 100), MathUtil.nextInteger(0, 500));
        }

        // show on screen
        m1.showGUI();
    }
}
