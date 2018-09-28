package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int day;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] r = new char[100][100];
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int p;
		int q;
		int sum = 0;
		int l;
		int o;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				r[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (r[i][j] == '@')
				{
					a[i][j] = 1;
				}
				if (r[i][j] == '#')
				{
					a[i][j] = 0;
				}
				if (r[i][j] == '.')
				{
					a[i][j] = -1;
				}
			}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < day;k++)
		{
			for (p = 1;p <= n;p++)
			{
				for (q = 1;q <= n;q++)
				{
					if (a[p][q] == k)
					{
						if (a[p + 1][q] == -1)
						{
							a[p + 1][q] = k + 1;
						}
						if (a[p - 1][q] == -1)
						{
							a[p - 1][q] = k + 1;
						}
						if (a[p][q + 1] == -1)
						{
							a[p][q + 1] = k + 1;
						}
						if (a[p][q - 1] == -1)
						{
							a[p][q - 1] = k + 1;
						}
					}
				}
			}
		}
		for (l = 1;l <= n;l++)
		{
			for (o = 1;o <= n;o++)
			{
				if (a[l][o] > 0)
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

