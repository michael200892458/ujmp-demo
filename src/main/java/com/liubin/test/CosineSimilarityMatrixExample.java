package com.liubin.test;

import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.Calculation;

/**
 * Created by ThinkPad on 2016/5/2.
 */
public class CosineSimilarityMatrixExample {
    public static void main(String[] args) {
        // create matrix with 10 correlated columns, 100 rows, correlation 0.1
        Matrix correlated = Matrix.Factory.correlatedColumns(100, 10, 0.1);

        // calculate similarity and store in new matrix,
        // ignore missing values if present
        Matrix similarity = correlated.cosineSimilarity(Calculation.Ret.NEW, true);

        // show on screen
//        correlated.showGUI();
        similarity.showGUI();
    }
}
