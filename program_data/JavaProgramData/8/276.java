package <missing>;

public class GlobalMembers
{
	public static void f1(int[] a, int[] b, int n, int m)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void f2(int[] a, int[] b, int n, int m)
	{
		int i;
		int j;
		int t;
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
			if (a[j] > a[j + 1])
			{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 1;j < m;j++)
			{
			if (b[j] > b[j + 1])
			{
				t = b[j];
				b[j] = b[j + 1];
				b[j + 1] = t;
			}
			}
		}
	}
	public static void f3(int[] a, int[] b, int[] c, int n, int m)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			c[i] = a[i];
		}
		for (i = 1;i <= m;i++)
		{
			c[i + n] = b[i];
		}
	}
	public static void f4(int[] c, int n, int m)
	{
		int i;
		for (i = 1;i < m + n;i++)
		{
			System.out.print(c[i]);
			System.out.print(' ');
		}
		System.out.print(c[m + n]);
	}
	public static int Main()
	{
		int[] a = new int[99];
		int[] b = new int[99];
		int[] c = new int[200];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f1(a, b, n, m);
		f2(a, b, n, m);
		f3(a, b, c, n, m);
		f4(c, n, m);
		return 0;
	}
}

