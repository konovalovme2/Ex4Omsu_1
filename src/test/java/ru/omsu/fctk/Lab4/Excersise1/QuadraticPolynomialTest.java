package ru.omsu.fctk.Lab4.Excersise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticPolynomialTest {

    @Test
    public void testEquals() {
        QuadraticPolynomial a = new QuadraticPolynomial(1,3,2);
        QuadraticPolynomial b = new QuadraticPolynomial(2,6,4);
        QuadraticPolynomial c = new QuadraticPolynomial(0,0,0);
        QuadraticPolynomial d = new QuadraticPolynomial(0,0,0);
        QuadraticPolynomial e = new QuadraticPolynomial(0,0,1);
        QuadraticPolynomial f = new QuadraticPolynomial(1,1,1);
        assertTrue(a.equals(b));
        assertTrue(c.equals(d));
        assertTrue(e.equals(f));
        assertFalse(a.equals(c));
        assertFalse(c.equals(e));
        assertFalse(e.equals(a));
    }

    @Test
    public void testHashCode() {
        QuadraticPolynomial a = new QuadraticPolynomial(1,3,2);
        QuadraticPolynomial b = new QuadraticPolynomial(2,6,4);
        QuadraticPolynomial c = new QuadraticPolynomial(0,0,0);
        QuadraticPolynomial d = new QuadraticPolynomial(0,0,0);
        QuadraticPolynomial e = new QuadraticPolynomial(0,0,1);
        QuadraticPolynomial f = new QuadraticPolynomial(1,1,1);
        assertTrue(a.hashCode() == b.hashCode());
        assertTrue(c.hashCode() == d.hashCode());
        assertTrue(e.hashCode() == f.hashCode());
        assertFalse(a.hashCode() == c.hashCode());
        assertFalse(c.hashCode() == e.hashCode());
        assertFalse(e.hashCode() == a.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("Корни уравнения:",new QuadraticPolynomial(1,1,1).toString());
        assertEquals("Корни уравнения: -1.0",new QuadraticPolynomial(1,2,1).toString());
        assertEquals("Корни уравнения: -1.0 -2.0",new QuadraticPolynomial(1,3,2).toString());
        assertEquals("Корни уравнения: -0.5",new QuadraticPolynomial(0,2,1).toString());
        assertEquals("Корни уравнения:",new QuadraticPolynomial(0,0,1).toString());
        assertEquals("Корни уравнения: Infinity",new QuadraticPolynomial(0,0,0).toString());
    }
}