package <missing>;

public class GlobalMembers
{
	//*************************
	// 5.9.cpp
	// ??  1200018415
	// 2012  10 25
	//***********************


	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 1000; // ????
		b = n / 100 - a * 10; // ????
		c = n / 10 - a * 100 - b * 10; // ????
		d = n % 10; // ????
		System.out.print(d);
		if (a != 0 || b != 0 || c != 0) // ???????
		{
			System.out.print(c);
		}
		if (a != 0 || b != 0) // ???3?4??
		{
			System.out.print(b);
		}
		if (a != 0) // ???4??
		{
			System.out.print(a);
		}
		return 0;

	}
}

