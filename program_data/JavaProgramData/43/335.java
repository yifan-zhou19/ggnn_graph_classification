package <missing>;

public class GlobalMembers
{
	public static int p(int n)
	{
		int i;
	if (n == 3)
	{
	return 1;
	}
	else
	{
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
		return 0;

			}
		if (i == n - 1)
		{
			return 1;
		}
		}
	}
	}
	public static int Main()
	{
		int m;
		int j;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (j = 3;j <= (m / 2);j++)
	{
		if (p(j) == 1)
		{
		if (p(m - j) == 1)
		{
	System.out.print(j);
	System.out.print(" ");
	System.out.print(m - j);
	System.out.print("\n");
		}
		}
	}
		return 0;
	}
}

