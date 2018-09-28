package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static void ccin(int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void turn(int[] c, int t)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < t - 1;i++)
		{
			for (j = 0;j < t - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					k = c[j];
					c[j] = c[j + 1];
					c[j + 1] = k;
				}
			}
		}
	}
	public static void ccout(int m, int n)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[n - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ccin(m, n);
		turn(a, m);
		turn(b, n);
		ccout(m, n);
		return 0;
	}
}

