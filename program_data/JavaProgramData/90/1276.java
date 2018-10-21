package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (m == 0 || m == 1)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		if (m < n)
		{
			n = m;
		}
		return f(m, n - 1) + f(m - n, n);

	}

	public static int Main()
	{
		int i = 0;
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i < t)
		{
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(f(m, n));
		   System.out.print("\n");
		  i++;
		}

		return 0;
	}
}

