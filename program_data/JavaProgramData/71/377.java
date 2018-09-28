package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int[] f = new int[200];
		int[] g = new int[200];
		int[] h = new int[200];
		int i;
		int j;
		int[] d = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		int[] e = {3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < x;i++)
		{
			h[i] = 0;
		}
		for (i = 0;i < x;i++)
		{
				if (b[i] > c[i])
				{
					f[i] = b[i];
					g[i] = c[i];
				}
				else
				{
					g[i] = b[i];
					f[i] = c[i];
				}
		}
		for (i = 0;i < x;i++)
		{
		for (j = g[i] - 1;j < f[i] - 1;j++)
		{
			if ((a[i] % 4 == 0 && a[i] % 100 != 0) || a[i] % 400 == 0)
			{
			h[i] = h[i] + e[j];
			}
			else
			{
			h[i] = h[i] + d[j];
			}
		}
		}
		for (i = 0;i < x;i++)
		{
			if (h[i] % 7 == 0)
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

