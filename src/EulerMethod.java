public class EulerMethod {

    public static double x=1,y=2;
    public static double value=2;
    public static double h=0.25;

    public static void main(String[] args) {
        while (x!=value){
            y=y+h*f(x,y);
            x+=h;
        }

        System.out.printf("value of y at x=%.2f is: %.2f\n",x,y);
    }

    //dy/dx=f(x,y)
    public static double f(double x, double y){
        return 3*x*x+1;
    }
}
