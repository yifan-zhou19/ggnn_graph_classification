package <missing>;

public class GlobalMembers
{
	public static int m;
	public static void cauclute(int n, int k)
	{
		int j = 1;
		int i = 1;
		while (i <= n)
		{
			for (i = 1;i <= n;i++)
			{
				if (i == 1)
				{
					m = n * j + k;
				}
				else if (m % (n - 1) == 0)
				{
					m = m / (n - 1) * n + k;
				}
				else
				{
					j += 1;
					break;
				}
			}
		}
		System.out.print(m);
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cauclute(n, k);
		return 0;
	}
}

