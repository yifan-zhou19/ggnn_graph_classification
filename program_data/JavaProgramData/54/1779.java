package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int m;
	public static int a = 1;
	public static void go(int p)
	{
		p--;
		if (m % (n - 1) == 0 && m / (n - 1) != 0 && p >= 0)
		{
			m = m * n / (n - 1) + k;
			go(p);
		}
		else
		{
			if (p >= 0)
			{
				a = 0;
			}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double x;
		double y = n;
		x = Math.pow(y, n);
		for (int j = 1; j <= x ; j++)
		{
			a = 1;
			m = j;
			go(n);
			if (a == 1)
			{
				System.out.print(m);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}

}

