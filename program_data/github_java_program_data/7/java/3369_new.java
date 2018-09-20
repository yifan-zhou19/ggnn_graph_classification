

public class MergeSort extends SortingAlgorithm {
	
	@Override
	public void sort() {
		mergesort(S);
	}
	
	public void mergesort(Integer[] S) {
	    int i, n;
	    
	    n = S.length;
	    
	    if(n > 1) {
	        final int h = n / 2; // integer division automatically floors
	        int m = n - h;
	        
	        Integer[] U = new Integer[h];
	        Integer[] V = new Integer[m];
	        
	        for(i = 0; i < h; i++) {
	        	U[i] = S[i];
	        }
	        
	        for(i = 0; i < m; i++) {
	        	V[i] = S[i+h];
	        }
	        
	        mergesort(U);
	        mergesort(V);
	        merge(U, V, S);
	    }
	}
	
	public static void merge(Integer[] U, Integer[] V, Integer[] S) {
		int h = U.length;
		int m = V.length;
		
	    int i,j,k;
	    
	    i = j = k = 0;
	    
	    while(i < h && j < m) {
	        if(U[i] < V[j]) {
	            S[k] = U[i];
	            i++;
	        } else {
	            S[k] = V[j];
	            j++;
	        }
	        k++;
	    }
	    
	    if(i >= h) {
	        while(k < h+m) {
	            S[k] = V[j];
	            j++;
	            k++;
	        }
	    } else {
	        while(k < h+m) {
	            S[k] = U[i];
	            i++;
	            k++;
	        }
	    }
	}

}
