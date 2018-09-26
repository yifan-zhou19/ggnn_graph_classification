package <missing>;

public class GlobalMembers
{
	public static int max(int[][] a, int i)
	{
		int k = 0;
		int p = 0;
		while (p < 5)
		{
			if (a[i][p] > k)
			{
				k = a[i][p];
			}
			p++;
		}
		p = 0;
		while (p < 5)
		{
			if (a[i][p] == k)
			{
				return p;
			}
			p++;
		}
	}
	public static int judge(int[][] a, int y, int i)
	{
		int j = 0;
		while (j < 5)
		{
			if (j == i)
			{
				j++;
				continue;
			}
			else
			{
				if (a[j][y] < a[i][y])
				{
					return 0;
				}
			}
			j++;
		}
		return 1;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int x;
		int y;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (int i = 0;i < 5;i++)
		{
			y = max(a, i);
			if (judge(a, y, i) != 0)
			{
				System.out.printf("%d %d %d", i + 1,y + 1,a[i][y]);
				return 0;
			}
		}
		System.out.print("not found");
		return 0;
	}
}

