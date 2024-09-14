package ru.ssau.tk.DoubleA.javalabs.functions;

import java.lang.Math;

public class nRootCalculateFunction implements MathFunction {

    private int rootDegree;

    public nRootCalculateFunction(int rootDegree) {
        this.rootDegree = rootDegree;
    }

    public int getRootDegree() {
        return rootDegree;
    }
    public void setRootDegree(int rootDegree) {
        this.rootDegree = rootDegree;
    }

    @Override
    public double apply(double x) {
        return Math.pow(Math.E, (1/((double)rootDegree))*Math.log(x));
    }
}
