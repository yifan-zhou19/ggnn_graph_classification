package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] c = new int[20000];
	public static int n;
	public static int m;
	public static int wrh1(int[] a, int[] b)
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0 ;i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < m; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}

	public static int wrh2(int[] a, int[] b)
	{
		int i;
		int j;
		int temp;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < m - 1; i++)
		{
			for (j = 0; j < m - i - 1; j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		return 0;
	}

	public static int wrh3(int[] a, int[] b, int[] c)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			c[i] = a[i];
		}
		for (i = 0; i < m; i++)
		{
			c[i + n] = b[i];
		}
		return 0;
	}

	public static int wrh4(int[] c)
	{
		int i;
		System.out.print(c[0]);
		for (i = 1; i < n + m; i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
		return 0;
	}

	public static int Main()
	{
		wrh1(a, b);
		wrh2(a, b);
		wrh3(a, b, c);
		wrh4(c);
		return 0;
	}
}

