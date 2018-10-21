package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int[] max = new int[5];
		int[] min = new int[5];
		int[][] sz = new int[5][5];
		int sum = 0;
		int[] big = new int[5];
		for (i = 0;i <= 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				sz[i][4] = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0;i < 5;i++)
		{
			max[i] = sz[i][0];
		}
		for (j = 0;j < 5;j++)
		{
			min[j] = sz[0][j];
		}
		for (i = 0;i < 5;i++)
		{
			for (l = 0;l < 5;l++)
			{
				if (sz[i][l] >= max[i])
				{
					max[i] = sz[i][l];
					big[i] = l;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			for (l = 0;l < 5;l++)
			{
				if (sz[l][j] <= min[j])
				{
					min[j] = sz[l][j];
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (max[i] == min[big[i]])
			{
				System.out.printf("%d %d %d\n",i + 1,big[i] + 1,max[i]);
					sum++;
			}
			if (i == 4 && sum == 0)
			{
				System.out.print("not found");
			}
		}
		return 0;
	}
}

