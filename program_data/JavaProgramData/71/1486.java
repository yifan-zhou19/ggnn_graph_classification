package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		int z;
		if (x > y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}

	public static int min(int x,int y)
	{
		int z;
		if (x < y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}

	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int z;
		int j;
		int m;
		int[] b = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = 0;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((x % 100 == 0 && x % 400 == 0) || (x % 100 != 0 && x % 4 == 0))
			{
				int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				for (j = min(y, z);j < max(y, z);j++)
				{
					m += a[j];
				}
				b[i] = m;
			}
			else if ((x % 100 == 0 && x % 400 != 0) || (x % 4 != 0))
			{
				int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				for (j = min(y, z);j < max(y, z);j++)
				{
					m += a[j];
				}
				b[i] = m;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

