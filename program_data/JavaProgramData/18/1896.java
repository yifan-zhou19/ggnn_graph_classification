package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int[][] b = new int[100][100];
	public static int i;
	public static int j;
	public static int n;
	public static int num = 0;
	public static void m(int n) //????
	{
		int min;
		for (i = 0;i <= n - 1;++i)
		{
			min = a[i][0];
			for (j = 0;j <= n - 1;++j)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0;j <= n - 1;++j)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (j = 0;j <= n - 1;++j)
		{
			min = a[0][j];
			for (i = 0;i <= n - 1;++i)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (i = 0;i <= n - 1;++i)
			{
				a[i][j] = a[i][j] - min;
			}
		}
	}
	public static void del(int n) //?????
	{
		b[0][0] = a[0][0];
		for (j = 1;j <= n - 2;++j)
		{
			b[0][j] = a[0][j + 1];
		}
		for (i = 1;i <= n - 2;++i)
		{
			b[i][0] = a[i + 1][0];
		}
		for (i = 1;i <= n - 2;++i)
		{
			for (j = 1;j <= n - 2;++j)
			{
				b[i][j] = a[i + 1][j + 1];
			}
		}
		for (i = 0;i <= n - 1;++i)
		{
			for (j = 0;j <= n - 1;++j)
			{
				a[i][j] = b[i][j];
			}
		}
	}
	public static int s(int n) //????
	{
		m(n);
		num = num + a[1][1];
		del(n);
		if (n != 2)
		{
			s(n - 1); //??
		}
		return num;
	}
	public static int Main()
	{
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;++k)
		{
			for (i = 0;i <= n - 1;++i)
			{
			for (j = 0;j <= n - 1;++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			num = 0;
			System.out.print(s(n));
			System.out.print("\n");
		}
		return 0;
	}

}

