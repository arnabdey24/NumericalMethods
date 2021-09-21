import java.util.Arrays;

public class JacobiIterationMethod {
    public static double esp=1e-6;
    public static double limit=1000;
    public static double[][] sys ={
            {2,1,1,5},
            {3,5,2,15},
            {2,1,4,8}
    };
    public static void main(String[] args) {
        double[] ans=new double[sys.length];
        double[] preAns=new double[sys.length];
        int it=0;
        while (true){
            for (int i = 0; i < sys.length; i++) {
                ans[i]=sys[i][sys[i].length-1];
                for (int j = 0; j < sys[i].length-1; j++) {
                    if(j!=i){
                        ans[i]-=preAns[j]*sys[i][j];
                    }
                }
                ans[i]/=sys[i][i];
            }
            for (int i = 0; i < sys.length; i++) {
                preAns[i]=ans[i];
            }

            System.out.println("Iteration: "+it++);
            System.out.println(Arrays.toString(ans));


            double d=sys[0][sys[0].length-1];
            for (int i = 0; i < sys[0].length-1; i++) {
                d-=sys[0][i]*ans[i];
            }
            if(Math.abs(d)<esp)break;
            if(it>limit)break;
        }

        System.out.println("\nANS: ");
        for (double a : ans) {
            System.out.printf("%f\n",a);
        }
    }
}
