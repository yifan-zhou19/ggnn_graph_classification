package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][6];
		int n = 1000;
		int i;
		int k;
		int[] t = new int[100];


		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i][1] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][2] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][3] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sz[i][4] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				sz[i][5] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				sz[i][6] = Integer.parseInt(tempVar6);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (sz[i][1] == 0)
			{
				k = i;
				break;
			}
		}
		for (i = 0;i < k;i++)
		{
			t[i] = (sz[i][4] + 12 - sz[i][1]) * 3600 + (sz[i][5] - sz[i][2]) * 60 + (sz[i][6] - sz[i][3]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",t[i]);
		}


		return 0;
	}

}

