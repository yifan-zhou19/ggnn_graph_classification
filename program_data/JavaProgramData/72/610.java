package <missing>;

public class GlobalMembers
{
	public static double[][] mou = new double[20][20];
	public static int m;
	public static int n;
	public static int judge(int x,int y)
	{
		double sum = 0;
		double s = 0;
		if (x + 1 <= m)
		{
			if (mou[x + 1][y] <= mou[x][y])
			{
			sum++;
			}
			s++;
		}
		if (x - 1 >= 0)
		{
			if (mou[x - 1][y] <= mou[x][y])
			{
			sum++;
			}
			s++;
		}
		if (y + 1 <= n)
		{
			if (mou[x][y + 1] <= mou[x][y])
			{
			sum++;
			}
			s++;
		}
		if (y - 1 >= 0)
		{
			if (mou[x][y - 1] <= mou[x][y])
			{
			sum++;
			}
			s++;
		}
		if (sum == s)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				mou[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (judge(i, j) != 0)
				{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

