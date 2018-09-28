package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[][] area = new int[21][21];
	public static void scan()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n + 2;i++)
		{
			for (int j = 0;j < m + 2;j++)
			{
			area[i][j] = 0;
			}
		}
		for (int i = 1;i < n + 1;i++)
		{
			for (int j = 1;j < m + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					area[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	}
	public static void print()
	{
		for (int i = 1;i < n + 1;i++)
		{
			for (int j = 1;j < m + 1;j++)
			{
				if ((area[i][j] >= area[i - 1][j]) && (area[i][j] >= area[i + 1][j]) && (area[i][j] >= area[i][j - 1]) && (area[i][j] >= area[i][j + 1]))
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}
	public static int Main()
	{
		scan();
		print();
		return 0;
	}
}

