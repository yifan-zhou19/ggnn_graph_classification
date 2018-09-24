package <missing>;

public class GlobalMembers
{
	public static int check(int i, int a)
	{
		int means = 1;
		if (a == 1)
		{
			return 0;
		}
		if (a == 2)
		{
			return 1;
		}
		for (; i <= (int)Math.sqrt(a); i++)
		{
			if (a % i == 0)
			{
				means += check(i, a / i);
			}
		}
		return means;
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(check(2, a));
			System.out.print("\n");
		}
	}
}

