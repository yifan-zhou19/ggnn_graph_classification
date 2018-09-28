package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[102];
	public static int[] b = new int[102];
	public static int[] c = new int[202];
	public static int m;
	public static int n;

	public static void shuru()
	{
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu()
	{
		int i;
		int j;
		int t;



		for (i = 0;i < m;i++)
		{
			for (j = m - 1;j > i;j--)
			{
				if (a[j] < a[j - 1])
				{
					t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}

		for (i = 0; i < n; i++)
		{
			for (j = n - 1; j > i; j--)
			{
				if (b[j] < b[j - 1])
				{
					int t = b[j];
					b[j] = b[j - 1];
					b[j - 1] = t;
				}
			}
		}
	}
	public static void hebing()
	{
		int i = 0;
		int j = 0;

		for (i = 0; i < m; i++)
		{
			c[i] = a[i];
		}

		for (i = 0; i < n; i++)
		{
			c[m + i] = b[i];
		}
	}
	public static void xianshi()
	{
		int i = 0;
		System.out.print(a[0]);
		for (i = 1; i < n + m; i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
	}

	public static int Main()
	{
		shuru();
		paixu();
		hebing();
		xianshi();
		return 0;

	}



}

