package com.company;

import static java.lang.Double.NaN;

public class Divider implements Operation{

    @Override
    public double getResult(double a, double b) {

        if (b == 0) return NaN;
         else return a/b;

    }

}
