package <missing>;

public class GlobalMembers
{
	// *******************************************************
	//?????????                                     *
	//?????                                             *
	//???2013/10/23                                       *
	//???????????                                 *
	//********************************************************
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = a / 1000;
		c = (a - 1000 * b) / 100;
		d = (a - 1000 * b - 100 * c) / 10;
		e = a - 1000 * b - 100 * c - 10 * d;
		if (b > 0)
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
		}
		else if (b == 0 && c > 0)
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
		}
		else if (b == c == 0 && d > 0)
		{
			System.out.print(e);
			System.out.print(d);
		}
		else
		{
			System.out.print(e);
			System.out.print("\n");
		}
		return 0;
	}
}

