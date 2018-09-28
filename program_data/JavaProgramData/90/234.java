package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void f(int m, int n)
	{
		int i;
		if (m == 0)
		{
			num++;
		}
		else
		{
			for (i = 0;i <= n - 1;i++)
			{
				if (i == 0)
				{
					if (m >= n)
					{
						f(m - n, n);
					}
				}
				else
				{
					if (m >= n - i)
					{
						f(m - n + i, n - i);
					}
					else
					{
						continue;
					}
				}
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m >= n)
			{
				f(m, n);
				System.out.print(num);
				System.out.print("\n");
				num = 0;
			}
			else
			{
				f(m, m);
				System.out.print(num);
				System.out.print("\n");
				num = 0;
			}
		}
		return 0;
	}

}

