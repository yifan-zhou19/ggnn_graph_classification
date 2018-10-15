package Programs;

public class Fibonacci {
	
	public void printFibonacci_I(int n) {
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
	
	public void printFibonacci_R(int n) {
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		printFibonacci_R(a, b, n-2);
	}
	
	private void printFibonacci_R(int a, int b, int m) {
		if(0 == m) {
			return;
		} else {
			int c = a + b;
			System.out.println(c);
			printFibonacci_R(b, c , m-1);
			
		}
		
	}
	
public static void main(String[] args) {
	Fibonacci f = new Fibonacci();
	//f.printFibonacci_I(10);
	
	f.printFibonacci_R(7);
}
}
