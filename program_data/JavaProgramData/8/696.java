package <missing>;

public class GlobalMembers
{
	public static void duqu()
	{

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu()
	{
		int i = 0;
		int j = 0;
		int t;
		for (i = 0; i < m; i++)
		{
			for (j = i + 1; j < m; j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (b[i] > b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
	}
	public static void hebin()
	{

		for (int i = 0; i < m; i++)
		{
			c[i] = a[i];
		}
		for (int i = m; i < n + m; i++)
		{
			c[i] = b[i - m];
		}
	}
	public static void xianshi()
	{
		for (int i = 0; i < m + n - 1; i++)
		{
			System.out.print(c[i]);
			System.out.print(' ');
		}
		System.out.print(c[m + n - 1]);

	}
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int m;
	public static int n;
	public static int Main()
	{
		duqu();
		paixu();
		hebin();
		xianshi();
		return 0;
	}
}

