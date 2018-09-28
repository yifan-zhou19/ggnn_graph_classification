package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int n;

	public static int f(int a, int m)
	{
		if (a == 1)
		{
			return m;
		}
		if (m % (n - 1) != 0)
		{
			return 0;
		}
		else
		{
			return f(a - 1, m * n / (n - 1) + k);
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;;i++)
		{
			int sum = f(n, i * n + k);
			if (sum != 0)
			{
				System.out.print(sum);
				break;
			}
		}


		return 0;
	}
}

