package <missing>;

public class GlobalMembers
{
	public static int min(int[] a)
	{
		int n = 0;
		int i;
		int x = a[0];
		while (a[n] != 0)
		{
			n++;
		}

		for (i = 0;i <= n - 1;i++)
		{
			if (x > a[i])
			{
				x = a[i];
			}
		}

		return x;
	}

	public static int f(int[] a)
	{
		int n = 0;
		while (a[n] != 0)
		{
			n++;
		}

		if (n == 1)
		{
			return 1;
		}
		else
		{
			int[] b = new int[25];
			int[] c = new int[25];
			int i;
			if (a[n - 1] == min(a))
			{
				for (i = 0;i <= n - 2;i++)
				{
					b[i] = a[i];
				}
				b[n - 1] = 0;

				return 1 + f(b);
			}
			else
			{
				int k = 0;
				for (i = 0;i <= n - 1;i++)
				{
					if (a[i] != min(a))
					{
						b[k] = a[i];
						k++;
					}
				}
				b[k] = 0;

				do
				{
					n--;
				} while (a[n] != min(a));
				for (i = 0;i <= n;i++)
				{
					c[i] = a[i];
				}
				c[n + 1] = 0;

				return f(b) > f(c) != 0?f(b):f(c);
			}
		}
	}

	public static void Main()
	{
		int n;
		int[] a = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int k;
		for (k = 0;k <= n - 1;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Integer.parseInt(tempVar2);
			}
		}
		a[n] = 0;

		System.out.printf("%d\n",f(a));
	}
}

