
public class LinearRegression {

    private double alpha, beta;
    private double mean_x, mean_y;
    private double SS_x, SS_y;
    private int n;

    public LinearRegression(double[] x, double[] y) {
        mean_x = computeMean(x);
        mean_y = computeMean(y);
        n = x.length;
        
        for(int i = 0; i < n; i++){
            SS_x += (x[i] - mean_x) * (x[i] - mean_x);
            SS_y += (x[i] - mean_x) * (y[i] - mean_y);
        }
        
        beta = SS_y / SS_x;
        alpha = mean_y - beta * mean_x;
    }

    private double computeMean(double[] x){
       double mean = 0;
       for (int i = 0; i < x.length; i++) {
           mean += x[i] / x.length;
       }
       return mean;
    }

    public double getIntercept() {
        return alpha;
    }

    public double getSlope() {
        return beta;
    }
}
