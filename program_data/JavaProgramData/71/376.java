package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int i;
		int j;
		int m;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] d = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		int[] e = new int[200];
		int[] f = new int[200];
		for (i = 0;i < m;i++)
		{
			if (b[i] >= c[i])
			{
			e[i] = b[i];
			f[i] = c[i];
			}
			else
			{
				e[i] = c[i];
				f[i] = b[i];
			}
		}
		for (i = 0;i < m;i++)
		{
			k = 0;
			if ((a[i] % 4 == 0 && a[i] % 100 != 0) || a[i] % 400 == 0)
			{
				d[1] = 1;
			}
			else
			{
				d[1] = 0;
			}
			for (j = f[i];j < e[i];j++)
			{
				k = k + d[j - 1];
			}
			if (k % 7 == 0)
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

