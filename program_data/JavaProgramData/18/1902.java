package <missing>;

public class GlobalMembers
{
	public static void diminish(int[][] a, int stair)
	{
		int i;
		int j;
		int[] min = new int[105];
		for (i = 1;i <= stair;i++) //??i???????
		{
			min[i] = a[i][1];
			for (j = 1;j <= stair;j++)
			{
				if (a[i][j] < min[i])
				{
					min[i] = a[i][j];
				}
			}
			for (j = 1;j <= stair;j++)
			{
				a[i][j] -= min[i];
			}
		}
		for (i = 1;i <= stair;i++) //??i???????
		{
			min[i] = a[1][i];
			for (j = 1;j <= stair;j++)
			{
				if (a[j][i] < min[i])
				{
					min[i] = a[j][i];
				}
			}
			for (j = 1;j <= stair;j++)
			{
				a[j][i] -= min[i];
			}
		}
	}
	public static void lowerstair(int[][] a, int stair)
	{
		int i;
		int j;
		for (i = 2;i <= stair - 1;i++) //???
		{
			for (j = 1;j <= stair;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (i = 2;i <= stair - 1;i++) //???
		{
			for (j = 1;j <= stair;j++)
			{
				a[j][i] = a[j][i + 1];
			}
		}
	}
	public static int deal(int[][] a, int stair)
	{
		int result = 0;
		while (stair >= 2)
		{
			diminish(a, stair);
			result += a[2][2];
			lowerstair(a, stair);
			stair--;
		}
		return result;
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int stair;
		int sum;
		int[][] a = new int[105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			stair = n;
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			sum = deal(a, stair);
			System.out.printf("%d\n",sum);
		}
	}

}

