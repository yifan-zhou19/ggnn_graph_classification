package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] array = new int[101][101];
	public static int[] sum = new int[101];
	public static int k;
	public static void cut(int m)
	{
		int p;
		int q;
		int min;
		for (p = 0;p < n - m;p++)
		{
			min = array[p][0];
			for (q = 1;q < n - m;q++)
			{
				if (array[p][q] < min)
				{
					min = array[p][q];
				}
			}
			for (q = 0;q < n - m;q++)
			{
				array[p][q] = array[p][q] - min;
			}
		}
		for (p = 0;p < n - m;p++)
		{
			min = array[0][p];
			for (q = 1;q < n - m;q++)
			{
				if (array[q][p] < min)
				{
					min = array[q][p];
				}
			}
			for (q = 0;q < n - m;q++)
			{
				array[q][p] = array[q][p] - min;
			}
		}
		sum[k] = sum[k] + array[1][1];
		for (p = 1;p < n - m - 1;p++)
		{
			array[0][p] = array[0][p + 1];
			array[p][0] = array[p + 1][0];
		}
		for (p = 1;p < n - m - 1;p++)
		{
			for (q = 1;q < n - m - 1;q++)
			{
				array[p][q] = array[p + 1][q + 1];
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						array[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				cut(i);
			}
		}
		for (k = 0;k < n;k++)
		{
			System.out.printf("%d\n",sum[k]);
		}

		return 0;
	}
}

