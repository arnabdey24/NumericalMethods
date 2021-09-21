public class SecantMethod {
    public static double limit = 100;
    public static double esp = 1e-3;
    public static double[] a = {1, -4, -10};  //your equation

    public static void main(String[] args) {
        double x1 = a[1] / a[0];
        double x2 = a[2] / a[0];
        double xMax = Math.sqrt((x1 * x1) - 2 * x2);

        double a = 0;   //guessing values here
        double b = -1;

        //System.out.println("a\t\t\t\tb\t\t\tf(a)\t\t\tf(b)\t\tc=b-f(b)*[(b-a)/(f(b)-f(a))]");
        //System.out.println("---------------------------------------------------------------------------------------------");
        int i = 0;
        while (true) {
            i++;
            double c = b - f(b) * ((b - a) / (f(b) - f(a)));
            //System.out.printf("%.6f%14.6f%14.6f%14.6f%22.6f\n", a, b, f(a), f(b), c);
            if (Math.abs(f(c)) < esp) {
                System.out.printf("\nAns: %.6f\n", c);
                break;
            }
            a = b;
            b = c;

            if (i > limit) break;
        }
    }

    /**
     * if given a algebraic equation un-comment it
     */
    public static double f(double x) {
        double p = a[0];
        for (int i = 1; i < a.length; i++) {
            p = p * x + a[i];
        }
        return p;
    }

    /*public static double f(double x) {
        //return (Math.log10(x)-Math.cos(x));
        return (Math.pow(Math.E,x)-3*x);
        //return (Math.tan(x)-x);
        //return (x-1.5*Math.sin(x)-2.5);
        //return (Math.sin(x)-x+2);
    }*/

}
