public class TaylorSeriesMethod {

    public static double x=0,y=0;
    public static double value=.4;
    public static double h=0.2;

    public static void main(String[] args) {
        while(x!=value){
            y=y+(h*y1(x,y))+(h*h*y2(x,y)/2)+(h*h*h*y3(x,y)/6);
            x+=h;
        }

        System.out.printf("value of y at x=%.2f is: %.4f\n",x,y);
    }

    public static double y1(double x,double y){
        return x*x+y*y;
    }

    public static double y2(double x,double y){
        return 2*x+2*y*y1(x,y);
    }

    public static double y3(double x,double y){
        return 2+2*y1(x,y)*y1(x,y)+2*y*y2(x,y);
    }

}
