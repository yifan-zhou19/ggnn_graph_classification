package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int[] q = new int[10000];
	public static int[] p = new int[10000];

	public static void a()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			p[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void b(int[] x, int[] y)
	{
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
			//cout <<x[j] <<x[j+1];
			if (x[j] > x[j + 1])
			{
				k = x[j + 1];
				x[j + 1] = x[j];
				x[j] = k;
			}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
			//cout <<x[j] <<x[j+1];
			if (y[j] > y[j + 1])
			{
				k = y[j + 1];
				y[j + 1] = y[j];
				y[j] = k;
			}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.print(x[i]);
			System.out.print(' ');
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(y[i]);
			System.out.print(' ');
		}
		System.out.print(y[n - 1]);
		System.out.print("\n");
	}

	public static int Main()
	{
		a();
		b(p, q);
		return (0);
	}

}

