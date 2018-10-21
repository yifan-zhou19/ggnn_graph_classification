package <missing>;

public class GlobalMembers
{
	/*
	 * 2.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: b
	 */

	public static int Main()
	{
		int a; //????
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = (int)(a / 100); //100?
		c = (int)((a - 100 * b) / 50); //50
		d = (int)((a - 100 * b - 50 * c) / 20); //20
		e = (int)((a - 100 * b - 50 * c - 20 * d) / 10); //10
		f = (int)((a - 100 * b - 50 * c - 20 * d - 10 * e) / 5); //5
		g = (int)((a - 100 * b - 50 * c - 20 * d - 10 * e-5 * f) / 1); //1
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(d);
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
		System.out.print(g);
		System.out.print("\n");
		return 0;
	}

}

