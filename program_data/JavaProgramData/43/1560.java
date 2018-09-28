package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int c;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3; i <= m / 2; i++)
		{
			c = 1;
					  for (int j = 2; j <= i; j++)
					  {
				if (i % j == 0 && j != i)
				{
					c = 0;
					break;
				}
				if (j == i)
				{
					break;
				}
					  }
			if (c != 0)
			{
				n = m - i;

				for (int k = 2; k <= n; k++)
				{
					if (n % k == 0 && n != k)
					{
						break;
					}
					if (n == k)
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(n);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

