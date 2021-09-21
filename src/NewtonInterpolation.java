public class NewtonInterpolation {
    public static double[] x = {1, 2, 3, 4, 5};
    public static double[] f = {0, 7, 26, 63, 124};
    public static double value = 1.5;

    public static void main(String[] args) {
        double[][] table = new double[f.length][f.length];
        double[] a = new double[f.length];

        for (int i = 0; i < f.length; i++) {
            table[i][0] = f[i];
        }

        for (int j = 1; j < f.length; j++) {  //j is the difference here
            for (int i = 0; i < f.length - j; i++) {
                table[i][j] = (table[i + 1][j - 1] - table[i][j - 1]) / (x[i + j] - x[i]);
            }
        }

        for (int i = 0; i < f.length; i++) {
            a[i] = table[0][i];
        }

        double p = 0.0;
        for (int i = 0; i < a.length; i++) {
            double tmp = a[i];
            for (int j = 0; j < i; j++) {
                tmp *= (value - x[j]);
            }
            p+=tmp;
        }

        System.out.printf("Interpolated value at %.2f is: %.2f\n",value,p);
    }

}
