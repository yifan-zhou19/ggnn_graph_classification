package <missing>;

public class GlobalMembers
{
	public static int h;
	public static int l;
	public static int[][] a = new int[10][10];

	public static int find1(int p,int q)
	{
		int i;
		int max = a[p][q];
		for (i = 0;i < l;i++)
		{
			if (a[p][i] > max)
			{
				return 1;
			}
		}
		return 2;
	}

	public static int find2(int p,int q)
	{
		int j;
		int min = a[p][q];
		for (j = 0;j < h;j++)
		{
			if (a[j][q] < min)
			{
				return 3;
			}
		}
		return 2;
	}

	public static int Main()
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (find1(i, j) == find2(i, j))
				{
					System.out.printf("%d+%d",i,j);
					return 0;
				}
			}
		}
		System.out.print("No");
		return 0;
	}
}

