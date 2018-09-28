package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
		int e = 1;
		int i = 3;
		if (a < 7)
		{
			a += 8;
		}
		else
		{
			if (a == 7)
			{
				return 1;
			}
		}
		for (i = 3;i <= Math.sqrt(a * 1.0);i += 2)
		{
			e *= a % i;
			if (e != 0)
			{
				e = 1;
			}
		}
		if (e != 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i = 3;
		int m;
		int d;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= m / 2;i += 2)
		{
			if (prime(i) != 0)
			{
				d = m - i;
				if (prime(d) != 0)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(d);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

