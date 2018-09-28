package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][6];
		int[] jg = new int[100];
		int result1;
		int result2;
		int result;
		int i;
		int j;
		for (i = 0;;i++)
		{
			result1 = 0;
			result2 = 0;
			result = 0;
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
			if (sz[i][0] == 0 && sz[i][1] == 0 && sz[i][2] == 0 && sz[i][3] == 0 && sz[i][4] == 0 && sz[i][5] == 0)
			{
				break;
			}
			result1 += (sz[i][0] * 3600 + sz[i][1] * 60 + sz[i][2]);
			result2 += ((sz[i][3] + 12) * 3600 + sz[i][4] * 60 + sz[i][5]);
			result += (result2 - result1);
			jg[i] += result;
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d\n",jg[j]);
		}
		return 0;
	}
}

