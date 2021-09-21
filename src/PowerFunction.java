public class PowerFunction {
    public static double[] x={1,2,3,4,5};
    public static double[] y={.5,2,4.5,8,12.5};

    public static void main(String[] args) {
        System.out.println("\t\tXi\t\t\t\tYi\t\t\t\tln Xi\t\t\tln Yi\t\t\t(ln Xi)^2\t\t(ln Xi)(ln Yi)");
        System.out.println("---------------------------------------------------------------------------------------------------");
        double sumOflnx=0,sumOflny=0,sumOflnxSqure=0,sumOflnxlny=0;
        for (int i = 0; i < x.length; i++) {
            double X=Math.log(x[i]);
            double Y=Math.log(y[i]);
            sumOflnx+=X;
            sumOflny+=Y;
            sumOflnxSqure+=(X*X);
            sumOflnxlny+=X*Y;
            System.out.printf("\t\t%f\t\t%f\t\t%f\t\t%f\t\t%f\t\t%f\n",x[i],y[i],X,Y,(X*X),(X*Y));
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("sum\t\t\t\t\t\t\t\t\t\t%f\t\t%f\t\t%f\t\t%f\n",sumOflnx,sumOflny,sumOflnxSqure,sumOflnxlny);

    }
}
