package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		for (i = 0;i <= 4;++i)
		{
			for (j = 0;j <= 4;++j)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
			scanf("\n");
		}
		for (i = 0;i <= 4;++i)
		{
			max[i] = 0;
			for (j = 0;j <= 4;++j)
			{
				if (max[i] < a[i][j])
				{
					max[i] = a[i][j];
				}
			}
		}
		for (j = 0;j <= 4;++j)
		{
			min[j] = 9999999;
			for (i = 0;i <= 4;++i)
			{
				if (min[j] > a[i][j])
				{
					min[j] = a[i][j];
				}
			}
		}
		k = 0;
		for (i = 0;i <= 4;++i)
		{
			for (j = 0;j <= 4;++j)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,max[i]);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}

}

