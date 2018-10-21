package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int sum = 0;

	public static int minr(int u,int n)
	{
		int i;
		int minn = a[u][1];
		for (i = 1; i <= n; i++)
		{
			if (minn >= a[u][i])
			{
				minn = a[u][i];
			}
		}
		return minn;
	}

	public static int minc(int v, int n)
	{
		int i;
		int minn = a[1][v];
		for (i = 1; i <= n; i++)
		{
			if (minn >= a[i][v])
			{
				minn = a[i][v];
			}
		}
		return minn;
	}

	//* ???? *//
	public static void f2(int n)
	{
		int u;
		int v;
		for (u = 2; u <= n - 1; u++)
		{
			for (v = 1; v <= n; v++)
			{
				a[u][v] = a[u + 1][v];
			}
		}
		for (v = 2; v <= n - 1; v++)
		{
			for (u = 1; u <= n; u++)
			{
				a[u][v] = a[u][v + 1];
			}
		}
		return;
	}


	//* ???? *//
	public static void f1(int n)
	{
		if (n == 1)
		{
			System.out.print(sum);
			System.out.print("\n");
			return;
		}
		int u;
		int v;
		//* row cancle *//
		for (u = 1; u <= n; u++)
		{
			int temp = minr(u, n);
			for (v = 1; v <= n; v++)
			{
				a[u][v] = a[u][v] - temp;
			}
		}
		//* col cancle *//
		for (v = 1; v <= n; v++)
		{
			int temp = minc(v, n);
			for (u = 1; u <= n; u++)
			{
				a[u][v] = a[u][v] - temp;
			}
		}
		sum = sum + a[2][2];
		f2(n);
		f1(n - 1);
	}


	public static int Main()
	{
		int n;
		int i;
		int u;
		int v;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sum = 0;
			for (u = 1; u <= n; u++)
			{
				for (v = 1; v <= n; v++)
				{
					a[u][v] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			f1(n);
		}
		return 0;
	}
}

