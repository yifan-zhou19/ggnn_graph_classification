import java.util.List;

public class LogisticRegression {
    
    private double[] weights;
    private final double RATE = 0.0001;
    
    public LogisticRegression(int size){
        weights = new double[size];
    }
    
    public double sigmoid(double x){
        return 1 / (1 + Math.exp(-x)); 
    }
    
    public double predict(int[] x){
        
        double l = 0;
        for(int i = 0; i < x.length; i++){
            l += x[i] * weights[i]; 
        }
        
        return sigmoid(l);
    }
    
    public void train(List <Entry> entries, int n){
        
        for(int i = 0; i < n; i++){
            
            int[] x = entries.get(i).getSet();
            int label = entries.get(i).getLabel();
            
            for(int j = 0; j < weights.length; j++){
                weights[j] = weights[j] + RATE * (label - predict(x)) * x[j];
            }
        }
    }
    
    public static class Entry{
        
        private int label;
        private int[] x;
        
        public Entry(int label, int[] x){
            this.label = label;
            this.x = x;
        }
        
        public int getLabel(){
            return this.label;
        }
        
        public int[] getSet(){
            return this.x;
        }
    } 
}
