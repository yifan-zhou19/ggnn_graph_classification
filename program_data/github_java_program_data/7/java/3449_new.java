class MergeSort{

  static int N = 10;
  static int[] sort = new int[N];
  
  static void mergeSort(int n, int[] x, int offset){
    if(n <= 1){
	  return;
	}
	
	int m = n / 2;
	
	mergeSort(m, x, offset);
	mergeSort(n - m, x, offset + m);
	
	int[] buffer = new int[m];
	
	for(int i = 0;i < m;i++){
	  buffer[i] = x[offset + i];
	}
	
	int j = m;
	int i = 0;
	int k = 0;
	while(i < m && j < n){
	  if(buffer[i] <= x[offset + j]){
	    x[offset + k++] = buffer[i++];
	  }else{
	    x[offset + k++] = x[offset + j++];
	  }
	}
	
	while(i < m){
	  x[offset + k++] = buffer[i++];
	}
  }
    
    public static void main(String args[]){
		int[] a = {10,4,6,45,68,30,61,5,21,11};
		
		mergeSort(N,a, 0);
		
		for(int i = 0; i < a.length; i++){
		  System.out.println(a[i]);
	    }
    }
}