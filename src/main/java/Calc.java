import java.util.List;

public class Calc {

    public static void main(String args[]){
        Calc tst = new Calc();
        System.out.println(tst.arcsin(0.9));
    }

    //method returns angle according to the X value
    public double arcsin(double x){
        if(x == 0) return 0.0;
        if(Double.isNaN(x)) return Double.NaN;
        if (x > 1 || x < -1) return Double.NaN;
        double res = 0;
        for(int n = 0; n < 20; n++){
            res = res + (Math.pow(x, (2*n+1))*factorial(2*n))/(Math.pow(4, n)*Math.pow(factorial(n), 2)*(2*n+1));
        }
        return res;
    }

    public static int factorial(int a){
        int res = 1;
        for(int i = 1; i <= a; i++){
            res = res * i;
        }
        return res;
    }
}
