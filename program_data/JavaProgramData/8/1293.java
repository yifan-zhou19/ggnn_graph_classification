package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] k = new int[200];
	public static void f1()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void f2(int[] c, int[] d)
	{
		for (int i = 0;i < m;i++)
		{
			for (int j = m - 1;j > i;j--)
			{
				if (c[j] < c[j - 1])
				{
					swap(c[j],c[j - 1]);
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = n - 1;j > i;j--)
			{
				if (d[j] < d[j - 1])
				{
					swap(d[j],d[j - 1]);
				}
			}
		}
	}
	public static void f3(int[] e, int[] f)
	{
		for (int i = 0;i < m + n;i++)
		{
			if (i < m)
			{
				k[i] = a[i];
			}
			else
			{
				k[i] = b[i - m];
			}
		}
	}
	public static void f4(int[] g)
	{
		for (int i = 0;i < n + m - 1;i++)
		{
			System.out.print(g[i]);
			System.out.print(" ");
		}
		System.out.print(g[n + m - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		f1();
		f2(a, b);
		f3(a, b);
		f4(k);
		return 0;
	}


}

