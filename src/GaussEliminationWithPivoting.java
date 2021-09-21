
public class GaussEliminationWithPivoting {

    public static double[][] sys={
            {3,6,1,16},
            {2,4,3,13},
            {1,3,2,9}
    };

    public static void main(String[] args) {
        for (int i = 0; i < sys.length; i++) {
            fixPivot(i);
            double pivot=sys[i][i];
            //normalization
            for (int j = 0; j < sys[i].length; j++) {
                sys[i][j]/=pivot;
            }
            //elimination
            for (int m = i+1; m <sys.length ; m++) {
                double pivotShadow=sys[m][i];
                for (int n = 0; n < sys[m].length; n++) {
                    sys[m][n]-=pivotShadow*sys[i][n];
                }
            }
        }

        double[] ans=getAns();

        System.out.println("Roots are: ");
        for (double a : ans) {
            System.out.printf("%f\n",a);
        }
    }

    private static double[] getAns() {
        double[] ans=new double[sys.length];
        ans[sys.length-1]=sys[sys.length-1][sys[sys.length-1].length-1];//last element in the matrix
        for (int i = sys.length-2; i >=0 ; i--) {
            double sum=0.0;
            for (int j = i+1; j < sys[i].length-1; j++) {
                sum+=sys[i][j]*ans[j];
            }
            sum=sys[i][sys[i].length-1]-sum;
            ans[i]=sum;
        }
        return ans;
    }

    private static void fixPivot(int i) {
        int pivotRow=i;
        for (int k = i+1; k < sys.length; k++) {
            if(sys[pivotRow][i]<sys[k][i]){
                pivotRow=k;
            }
        }

        for (int l = 0; l < sys[i].length; l++) {
            double tmp=sys[i][l];
            sys[i][l]=sys[pivotRow][l];
            sys[pivotRow][l]=tmp;
        }
    }

}
