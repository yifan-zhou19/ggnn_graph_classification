package <missing>;

public class GlobalMembers
{
	public static int fac(int p, int q)
	{
		int i;
		int t = 1;
		if (p > q)
		{
			return 0;
		}
		if (p == q)
		{
			return 1;
		}
		for (i = p; i <= Math.sqrt(q); i++)
		{
			if (q % i == 0)
			{
				t += fac(i, q / i);
			}
		}
		return t;
	}
	public static int Main()
	{
		int a;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fac(2, a));
			System.out.print("\n");
		}
		return 0;
	}
}

