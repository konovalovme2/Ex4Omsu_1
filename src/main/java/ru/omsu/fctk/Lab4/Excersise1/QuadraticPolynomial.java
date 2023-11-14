package ru.omsu.fctk.Lab4.Excersise1;

import java.sql.Array;
import java.util.Arrays;

import static java.lang.Math.sqrt;

public class QuadraticPolynomial{
    double[] x;

    public QuadraticPolynomial(double a, double b, double c) {
        if (a != 0) {
            double disc=(b * b) - 4 * a * c;
            if(disc<0){
                x=new double[0];
            }
            else if (disc>0){
                x = new double[2];
                x[0] = ((-1)*b + sqrt(disc))/(2*a);
                x[1] = ((-1)*b - sqrt(disc))/(2*a);
            }
            else{
                x = new double[1];
                x[0] = ((-1)*b)/(2*a);
            }
        }
        else if (b != 0){
            x = new double[1];
            x[0] = ((-1)*c)/b;
        }
        else if (c != 0){
            x=new double[0];
        }
        else{
            x=new double[1];
            x[0]=1.0/0.0;
        }
    }

    public QuadraticPolynomial(QuadraticPolynomial a){
        x=new double[a.getRoots().length];
        for (int i = 0; i < a.getRoots().length; i++) {
            x[i]=a.getRoots()[i];
        }
    }

    public double[] getRoots() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuadraticPolynomial that)) return false;
        return Arrays.equals(getRoots(), that.getRoots());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getRoots());
    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder("Корни уравнения:");
        for (double i : x) {
            a.append(" ").append(i);
        }
        return a.toString();
    }
}
