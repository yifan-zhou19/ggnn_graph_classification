package <missing>;

public class GlobalMembers
{
	public static void mix(int m, int n)
	{
		int i;
		int j;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int t;
		for (i = 1; i <= m; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1; j < m; j++)
		{
			for (i = 1; i <= m - j; i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (j = 1; j < n; j++)
		{
			for (i = 1; i <= n - j; i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
		for (i = 1; i <= m; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(b[1]);
		for (i = 2; i <= n; i++)
		{
			System.out.print(" ");
			System.out.print(b[i]);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mix(m, n);
		return 0;
	}
}

