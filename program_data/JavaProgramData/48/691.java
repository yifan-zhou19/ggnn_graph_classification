package <missing>;

public class GlobalMembers
{
	public static int[][] c = new int[11][11]; //???n?????
	public static int[][] temp = new int[11][11]; //????n-1?????
	public static int n;
	public static int m;
	public static int deal(int num)
	{
		int i;
		int j;
		if (num == n + 1) //??????
		{
			return 0;
		}
		else
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					c[i][j] += temp[i][j];
					c[i + 1][j] += temp[i][j];
					c[i - 1][j] += temp[i][j];
					c[i][j + 1] += temp[i][j];
					c[i][j - 1] += temp[i][j];
					c[i + 1][j + 1] += temp[i][j];
					c[i + 1][j - 1] += temp[i][j];
					c[i - 1][j + 1] += temp[i][j];
					c[i - 1][j - 1] += temp[i][j];

				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					temp[i][j] = c[i][j];
				}
			}
				deal(num + 1);
		}

	}
	public static int Main()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c[5][5] = m;
		temp[5][5] = m;
		deal(1);
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.print(c[i][j]);
				System.out.print(' ');
			}
				System.out.print(c[i][9]);
			System.out.print("\n");
		}
		return 0;
	}
}

