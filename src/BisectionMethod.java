public class BisectionMethod {
    public static double limit = 100;
    public static double esp = 1e-2;
    public static double[] equ = {1, -4, -10};  //your equation

    public static void main(String[] args) {
        double x1 = equ[1] / equ[0];
        double x2 = equ[2] / equ[0];
        double xMax = Math.sqrt((x1 * x1) - 2 * x2);
        double a = -xMax;   //guessing values here
        double b = xMax;
        //System.out.println("a\t\t\tb\t\t\tf(a)\t\t\tmid=(a+b)/2\t\t\tf(mid)");
        //System.out.println("-------------------------------------------------------");
        int i = 0;
        while (true) {
            i++;
            double mid = (a + b) / 2;
            double d = f(a) * f(mid);
            //System.out.printf("%.6f%14.6f%14.6f%14.6f%14.6f\n", a, b, f(a), mid, f(mid));
            if (Math.abs(f(mid)) < esp) {
                System.out.printf("\nAns: %.6f\n", mid);
                break;
            } else if (d < 0) {
                b = mid;
            } else {
                a = mid;
            }

            if (i > limit) break;
        }
    }

    /**
     * if given a algebraic equation un-comment it
     */
    public static double f(double x) {
        double p = equ[0];
        for (int i = 1; i < equ.length; i++) {
            p = p * x + equ[i];
        }
        return p;
    }

    /*public static double f(double x) {
        //return (Math.log10(x)-Math.cos(x));
        //return (Math.pow(Math.E,-x)-x);
        //return (Math.tan(x)-x);
        //return (x-1.5*Math.sin(x)-2.5);
        return  (Math.sin(x)-x+2);
    }*/

}
