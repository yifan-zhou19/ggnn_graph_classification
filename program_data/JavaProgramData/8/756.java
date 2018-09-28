package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void shuru(int x, int y, int[] a, int[] b)
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = x;
		n = y;
		for (int i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < y;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	} //????
	public static void paixu(int[] x, int l)
	{
		for (int i = 0;i < l - 1;i++)
		{
			for (int j = 0;j < l - 1 - i;j++)
			{
				if (x[j] > x[j + 1])
				{
					int p;
					p = x[j];
					x[j] = x[j + 1];
					x[j + 1] = p;
				}
			}
		}
	} //??????
	public static void hebing(int[] a, int[] b, int[] c, int m, int n)
	{
		for (int i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (int i = 0;i < n;i++)
		{
			c[i + m] = b[i];
		}
	} //????
	public static void shuchu(int[] c, int m, int n)
	{
		for (int i = 0;i < n + m;i++)
		{
			if (i == 0)
			{
				System.out.print(c[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(c[i]);
			}
		}
	} //????
	public static int Main()
	{
		shuru(m, n, a, b);
		paixu(a, m);
		paixu(b, n);
		hebing(a, b, c, m, n);
		shuchu(c, m, n);

		return 0;
	}
}

