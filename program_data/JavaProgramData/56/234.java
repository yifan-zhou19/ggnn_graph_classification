package <missing>;

public class GlobalMembers
{
	public static int fun(int m)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int n;
		a = m / 10000;
		b = m / 1000 - 10 * a;
		c = m / 100 - 100 * a - 10 * b;
		d = m / 10 - 1000 * a - 100 * b - 10 * c;
		e = m - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if ((a + b + c + d) == 0)
		{
			n = e;
		}
		else if ((a + b + c) == 0)
		{
			n = 10 * e + d;
		}
		else if ((a + b) == 0)
		{
			n = 100 * e+10 * d + c;
		}
		else if (a == 0)
		{
			n = 1000 * e+100 * d + 10 * c + b;
		}
		else
		{
			n = 10000 * e+1000 * d + 100 * c + 10 * b + a;
		}
		return n;
	}

	public static int Main()
	{
		int i;
		int a;
		for (i = 0;i < 100;++i)
		{
			if ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				System.out.print(fun(a));
				System.out.print("\n");
			}
		}
		return 0;
	}


}

