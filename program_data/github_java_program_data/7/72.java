
public class fibonacci {
	
	public static void main(String[] args){
	//	fibonacci(4);
	//	System.out.println(fibonacciRecursive(7));
		int[] array = {1, 5, 9, 10, 2};
		System.out.println(whoKnows(array, array.length));
	}
	
	public static int whoKnows(int[] x, int n){
		if(n==1)
			return x[n-1];
		else
			return Math.min(x[n-1], whoKnows(x, n-1));
		
	}
	
	public static int fibonacciRecursive(int n){
		int nthSum = 0;
		if(n<=2)
			return 1;
		else
			nthSum = fibonacciRecursive(n-1) + fibonacciRecursive(n-2); 
			return nthSum;
	}
	
	
	
	/*public static int fibonacci(int nthTerm){
		int previousTerm = 1;
		int beforePreviousTerm = 1;
		
		if(nthTerm<=2)
			return 1;
		int newTerm = previousTerm + beforePreviousTerm;
		for(int i = 2; i<nthTerm; i++){
			newTerm = previousTerm + beforePreviousTerm;
			beforePreviousTerm = previousTerm;
			previousTerm = newTerm;
			System.out.println(newTerm);
		}
		return nthTerm;
	}*/
}
