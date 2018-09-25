package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int[][] time = new int[1000][6];
		int[] jg = new int[1000];
		for (i = 0;1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				time[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				time[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				time[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				time[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				time[i][4] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				time[i][5] = Integer.parseInt(tempVar6);
			}
			if (time[i][0] == 0)
			{
				break;
			}
		}
		t = i;
		for (i = 0;i < t;i++)
		{
			jg[i] += (12 - time[i][0]) * 60 * 60 - time[i][1] * 60 - time[i][2];
			jg[i] += time[i][3] * 60 * 60 + time[i][4] * 60 + time[i][5];
			System.out.printf("%d\n",jg[i]);
		}
		return 0;
	}
}

