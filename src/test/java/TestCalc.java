import static junit.framework.Assert.*;
import org.junit.Test;


public class TestCalc {

    private boolean EPS_Equals(double a, double b, double EPS)
    {
        return Math.abs(b - a) < EPS;
    }

    @Test
    public void testCalcAsin1() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-4;
            assertTrue("TEST 1. asin(0.5) = 0.523599", EPS_Equals(0.523599, tester.arcsin(0.5), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testCalcAsin2() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 2. asin(-0.5) = -0.523599", EPS_Equals(-0.523599, tester.arcsin(-0.5), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testCalcAsin3() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 3. asin(0) = 0", EPS_Equals(0, tester.arcsin(0), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testCalcAsin4() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 4. asin(1) = PI/2", EPS_Equals(Math.PI/2, tester.arcsin(1), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testCalcAsin5() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 5. asin(-1) = -PI/2", EPS_Equals(-Math.PI/2, tester.arcsin(-1), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testCalcAsin6() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 6. asin(0.8) = 0.926232", EPS_Equals(0.926232, tester.arcsin(0.8), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testCalcAsin7() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 7. asin(-0.8) = -0.926232", EPS_Equals(-0.926232, tester.arcsin(-0.8), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testCalcAsin8() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 8. asin(0.3) = 0.304693", EPS_Equals(0.304693, tester.arcsin(0.3), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

}
