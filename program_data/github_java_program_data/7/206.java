
import java.util.*;
import java.math.BigInteger;

public class Fibonacci {
	static Hashtable<Integer, BigInteger> memo = new Hashtable<>();
	static BigInteger f;
	public static void main (String [] args){
		System.out.println("Enter the n: ");
		System.out.println("Answer: " + calculateNthFibonacci((new Scanner(System.in)).nextInt()));
	}

	public static BigInteger calculateNthFibonacci(int n){

		if(memo.containsKey(n)) return memo.get(n);

		if(n <= 2) f = BigInteger.valueOf(1);

		else f = calculateNthFibonacci(n-1).add(calculateNthFibonacci(n-2));
		return f;
	}

}