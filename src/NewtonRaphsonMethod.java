public class NewtonRaphsonMethod {
    public static double limit = 100;
    public static double esp = 1e-2;
    public static double[] a = {1, -4, -10};  //your equation
    public static double[] Da = {1, -4};  //your differentiate equation

    public static void main(String[] args) {
        double x1 = a[1] / a[0];
        double x2 = a[2] / a[0];
        double xMax = Math.sqrt((x1 * x1) - 2 * x2);

        double x = 1;   //guessing values here

        //System.out.println("Xn\t\t\tf(Xn)\t\t\tf'(Xn)\t\t\tXn+1=Xn-[f(Xn)/f'(Xn)]");
        //System.out.println("---------------------------------------------------------------------------------------------");
        int i = 0;
        while (true) {
            i++;
            double nextX = x - (f(x) / Df(x));

            //System.out.printf("%.6f%14.6f%14.6f%14.6f\n",x,f(x),Df(x),nextX);

            if (Math.abs(f(x)) < esp) {
                System.out.printf("\nAns: %.10f\n", nextX);
                break;
            }
            x = nextX;
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

    public static double Df(double x) {
        double p = Da[0];
        for (int i = 1; i < Da.length; i++) {
            p = p * x + Da[i];
        }
        return p;
    }

    /*public static double f(double x) {
        //return  (Math.log10(x)-Math.cos(x));
        //return  (Math.pow(Math.E,-x)-x);
        return  (Math.tan(x)-x);
        //return  (x-1.5*Math.sin(x)-2.5);
    }
    public static double Df(float x) {
        //return ((1/(x))+Math.sin(x));
        //return (-Math.pow(Math.E,-x)-1);
        return (Math.pow(1/Math.cos(x),2)-1);
        //return (1-1.5*Math.cos(x));
    }*/

}
