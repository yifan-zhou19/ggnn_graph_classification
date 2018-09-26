package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static void input()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int l;
		for (i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= n;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu(int[] a, int[] b)
	{
		int i;
		int j;
		int k;
		int l;
		for (i = 1;i < m;i++)
		{
			for (j = 1;j < m - i + 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n - i + 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					k = b[j];
					b[j] = b[j + 1];
					b[j + 1] = k;
				}
			}
		}
	}
	public static void he(int[] a, int[] b)
	{
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			c[i] = a[i];
		}
		for (j = i;j <= i + n;j++)
		{
			c[j] = b[j - i + 1];
		}
	}
	public static void output(int[] c)
	{
		System.out.print(c[1]);
		int i;
		for (i = 2;i <= m + n;i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
	}


	public static int Main()
	{
		input();
		paixu(a, b);
		he(a, b);
		output(c);
		return 0;
	}

}

