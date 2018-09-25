package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int la;
	public static int[] b = new int[100];
	public static int lb;
	public static int[] c = new int[200];
	public static int lc;

	public static void R()
	{
		int i;
		la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= la;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= lb;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return;
	}

	public static void S(int[] x, int lx)
	{
		int i;
		int j;
		for (i = 1;i < lx;i++)
		{
			for (j = 1;j <= lx - i;j++)
			{
				if (x[j] > x[j + 1])
				{
					int t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
				}
			}
		}
		return;
	}

	public static void M()
	{
		int i;
		for (i = 1;i <= la;i++)
		{
			c[i] = a[i];
		}
		for (i = la + 1;i <= la + lb;i++)
		{
			c[i] = b[i - la];
		}
		return;
	}

	public static void D()
	{
		int i;
		for (i = 1;i <= la + lb;i++)
		{
			if (i > 1)
			{
				System.out.print(" ");
			}
			System.out.print(c[i]);
		}
		System.out.print("\n");
		return;
	}

	public static int Main()
	{
		R();
		S(a, la);
		S(b, lb);
		M();
		D();
		return 0;
	}

}

