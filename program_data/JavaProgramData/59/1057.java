package <missing>;

public class GlobalMembers
{
	public static int judge(int x,int k)
	{
		if (x == -1)
		{
			return k + 1;
		}
		else
		{
			return x;
		}
	}

	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[110][110];
		int k = 1;
		int sum = 0;
		int i;
		int j;
		char t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				t = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (t)
				{
				case '.':
					a[i][j] = -1;
					break;
				case '#':
					a[i][j] = 0;
					break;
				case '@':
					a[i][j] = 1;
					break;

				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k < m)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] > 0 && a[i][j] != k + 1)
					{
						a[i - 1][j] = judge(a[i - 1][j], k);
						a[i][j - 1] = judge(a[i][j - 1], k);
						a[i + 1][j] = judge(a[i + 1][j], k);
						a[i][j + 1] = judge(a[i][j + 1], k);
					}
				}
			}
			k++;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] > 0)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}

}

