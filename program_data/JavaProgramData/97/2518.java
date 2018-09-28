package <missing>;

public class GlobalMembers
{
	/*
	 * k2.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: b
	 */
	public static int Main()
	{
		int n; //??????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int A; //???????????????
		int B;
		int C;
		int D;
		int E;
		int F;
		int a;
		int b;
		int c;
		int d;
			A = n / 100; //????
			a = n % 100;
			B = a / 50;
			b = a % 50;
			C = b / 20;
			c = b % 20;
			D = c / 10;
			d = c % 10;
			E = d / 5;
			F = d % 5;
		System.out.print(A);
		System.out.print("\n");
		System.out.print(B);
		System.out.print("\n");
		System.out.print(C);
		System.out.print("\n");
		System.out.print(D);
		System.out.print("\n");
		System.out.print(E);
		System.out.print("\n");
		System.out.print(F);
		System.out.print("\n");
		return 0; //???????????????0?
	}

}

