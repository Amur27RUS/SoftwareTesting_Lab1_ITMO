import static junit.framework.Assert.*;
import org.junit.Test;


public class TestCalc {

    private boolean EPS_Equals(double a, double b, double EPS)
    {
        return Math.abs(b - a) < EPS;
    }

    @Test
    public void asinPointFiveTest() {

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
    public void asinPointFiveSecondTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-4;
            assertTrue("TEST 1. asin(0.6) = 0.643501", EPS_Equals(0.643501, tester.arcsin(0.6), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinMinusPointFiveSecondTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-4;
            assertTrue("TEST 1. asin(-0.6) = -0.643501", EPS_Equals(-0.643501, tester.arcsin(-0.6), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinMinPointFiveTest() {

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
    public void asinZeroTest() {

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
    public void asinOneNumTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 4. asin(1) = PI/2", EPS_Equals(Math.PI/2, tester.arcsin(1), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinMinusOneNumTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 5. asin(-1) = -PI/2", EPS_Equals(-Math.PI/2, tester.arcsin(-1), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinOverMinusOneNumTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 5. asin(-1.1) = ERR", EPS_Equals(-Math.PI/2, tester.arcsin(-1.1), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinOverOneNumTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 5. asin(1.1) = ERR", EPS_Equals(-Math.PI/2, tester.arcsin(1.1), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinBeforeOneNumTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 5. asin(0.95) = ERR", EPS_Equals(1.253235, tester.arcsin(0.95), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinBeforeMinusOneNumTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 5. asin(-0.95) = ERR", EPS_Equals(-1.253235, tester.arcsin(-0.95), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinPointEightTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 6. asin(0.8) = 0.927295", EPS_Equals(0.927295, tester.arcsin(0.8), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinMinusPointEightTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 7. asin(-0.8) = -0.927295", EPS_Equals(-0.927295, tester.arcsin(-0.8), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinAfterZeroTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 8. asin(0.3) = 0.304693", EPS_Equals(0.304693, tester.arcsin(0.3), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinBeforeZeroTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertTrue("TEST 8. asin(-0.3) = -0.304693", EPS_Equals(-0.304693, tester.arcsin(-0.3), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinBeforePointEightTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 6. asin(0.7) = 0.775397", EPS_Equals(0.775397, tester.arcsin(0.7), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinBeforeMinusPointEightTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 6. asin(-0.7) = -0.775397", EPS_Equals(-0.775397, tester.arcsin(-0.7), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinAfterPointEightTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 6. asin(0.85) = 1.015985", EPS_Equals(1.015985, tester.arcsin(0.85), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void asinAfterMinusPointEightTest() {

        Calc tester = new Calc();
        try {
            final double EPS = 1.0e-5;
            assertFalse("TEST 6. asin(-0.85) = -1.015985", EPS_Equals(-1.015985, tester.arcsin(-0.85), EPS));
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

}
