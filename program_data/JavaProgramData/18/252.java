package <missing>;

public class GlobalMembers
{
	/*
	?????????????
	??????
	?????2010?12?
	???????????????
	**/

	public static int min(int[] a, int n)
	{
		int mini = a[0];
		int i;
		for (i = 1; i < n; i++)
		{
			if (a[i] < mini)
			{
				mini = a[i];
			}
		}
		return mini; //?????
	}
	public static int f(int[][] b, int n)
	{
		int i;
		int j;
		int m;
		int t;
		int lmin;
		if (n == 1) //n=1?????????????1*1??
		{
			return 0;
		}
		else
		{
			for (i = 0; i < n; i++)
			{
				m = min(b[i], n);
				for (j = 0; j < n; j++)
				{
					b[i][j] = b[i][j] - m; //?????????????
				}
			}
			for (i = 0; i < n; i++)
			{
				lmin = b[0][i];
				for (j = 0; j < n; j++)
				{
					if (b[j][i] < lmin)
					{
						lmin = b[j][i];
					}
				}
				if (lmin > 0)
				{
					for (j = 0; j < n; j++)
					{
						b[j][i] = b[j][i] - lmin;
					}
				}
			}
			t = b[1][1]; //???2??2???
			for (i = 0; i < n; i++)
			{
				for (j = 1; j < n - 1; j++)
				{
					b[i][j] = b[i][j + 1]; //??2???
				}
			}
			for (i = 0; i < n - 1; i++)
			{
				for (j = 1; j < n - 1; j++)
				{
					b[j][i] = b[j + 1][i]; //???2???
				}
			}
			return f(b, --n) + t; //??
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		while (m-- != 0)
		{
			int[][] a = new int[100][100];
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(f(a, n));
			System.out.print("\n");
		}
		return 0;
	}
}

