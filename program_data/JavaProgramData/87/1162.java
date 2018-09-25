package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[10][6];
		int i;
		for (i = 0;i < 10;i++)
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
			if (sz[i][0] == 0 && sz[i][1] == 0 && sz[i][2] == 0 && sz[i][3] == 0 && sz[i][4] == 0 && sz[i][5] == 0)
			{
				break;
			}
		}
		int[] szf = new int[10];
		for (i = 0;i < 10;i++)
		{
			if (sz[i][0] == 0 && sz[i][1] == 0 && sz[i][2] == 0 && sz[i][3] == 0 && sz[i][4] == 0 && sz[i][5] == 0)
			{
				break;
			}
			szf[i] = 3600 * (sz[i][3] + 12 - sz[i][0]) + 60 * (sz[i][4] - sz[i][1]) + sz[i][5] - sz[i][2];
			System.out.printf("%d\n",szf[i]);
		}
		return 0;
	}
}

