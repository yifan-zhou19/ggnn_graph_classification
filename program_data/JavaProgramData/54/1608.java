package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 2)
		{
			System.out.print(7);
			System.out.print("\n");
			return 0;
		}
		int p = Math.pow((double)n - 1, n - 1) - k;
		while (true)
		{
			int m = p * n + k;
			for (int i = 1; i < n; ++i)
			{
				if (m % (n - 1) == 0)
				{
					m = m / (n - 1) * n + k;
				}
				else
				{
					m = -1;
					break;
				}
			}
			if (m != -1)
			{
				System.out.print(m);
				System.out.print("\n");
				break;
			}
			p += 1;
		}
		return 0;
	}


}

