package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][6];
		int i;
		int k;
		int j = 0;
		int sum = 0;
		for (i = 0;i < 110;i++)
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
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			sz[i][5] = Integer.parseInt(tempVar6);
		}
		j++;
		if (sz[i][0] == 0)
		{
			break;
		}
		}
		for (k = 0;k < j - 1;k++)
		{
		sum += 12 * 3600 - sz[k][0] * 3600 - sz[k][1] * 60 - sz[k][2] + sz[k][3] * 3600 + sz[k][4] * 60 + sz[k][5];
		System.out.printf("%d\n",sum);
		sum = 0;
		}
	return 0;
	}
}

