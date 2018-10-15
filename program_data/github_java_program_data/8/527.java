package fibonacci;

public class Fibonacci {

	public int fibby(int x){
		
		int a = 0; 
		int b =1 ;
		int c; //c = a+b
		int count = 15;
		System.out.println(+a+" "+b);
		
		//for the position.
		for(int j=0; j<count; j++){
			if(j == x){
				System.out.println("The position is: "+x);
			}
		}
		System.out.print(+a+" "+b);
		for(int i=2; i<count;i++){
			c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
			
			
		}
		return x;
		
		}
		public static void main(String[] args){
			
			Fibonacci fib = new Fibonacci();
			
			fib.fibby(8);
			
			
			
			}

	}

