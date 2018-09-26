package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int b;
		int c;
		int[] a = new int[60];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = 60 - 3 * m;
			for (j = 1; j <= m; j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[m] <= b)
			{
				System.out.print(b);
				System.out.print("\n");
			}
			else
			{
				for (k = 1; k <= m; k++)
				{
					c = 60 - 3 * k;
					if (a[k] <= c != 0 && a[k + 1] >= c)
					{
						System.out.print(c);
						System.out.print("\n");
					}
					else if (a[k] <= c != 0 && a[k + 1] <= c != 0 && a[k + 1] >= c - 3)
					{
						System.out.print(a[k + 1]);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

