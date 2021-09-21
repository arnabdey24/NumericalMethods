
public class GaussJordan {

    public static double[][] sys={
            {3,6,1,16},
            {2,4,3,13},
            {1,3,2,9}
    };

    public static void main(String[] args) {
        for (int i = 0; i < sys.length; i++) {
            double pivot=sys[i][i];
            for (int j = 0; j < sys[i].length; j++) {
                sys[i][j]/=pivot;
            }
            for (int m = 0; m <sys.length ; m++) {
                if(m!=i){
                    double pivotShadow=sys[m][i];
                    for (int n = 0; n < sys[m].length; n++) {
                        sys[m][n]-=pivotShadow*sys[i][n];
                    }
                }
            }
        }


        System.out.println("Roots are: ");
        for (int i = 0; i < sys.length; i++) {
            System.out.printf("%f\n",sys[i][sys[i].length-1]);
        }
    }
}
