package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[120][120];
		char c;
		int i;
		int j;
		int n;
		int m;
		int d;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '.')
				{
					a[i][j] = -1; //??
				}
				if (c == '@')
				{
					a[i][j] = 1; //??
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 1;d <= m;d++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if ((a[i][j] < d) && (a[i][j]>0)) //???????????????
					{
						if (a[i - 1][j] == -1)
						{
							a[i - 1][j] = d; //????????
						}
						if (a[i + 1][j] == -1)
						{
							a[i + 1][j] = d;
						}
						if (a[i][j - 1] == -1)
						{
							a[i][j - 1] = d;
						}
						if (a[i][j + 1] == -1)
						{
							a[i][j + 1] = d;
						}
					}
				}
			}
		}
		sum = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] > 0)
				{
					sum++; //??????
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

