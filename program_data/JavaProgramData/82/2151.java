package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int max = 0;
		int y = 0;
		int[][] sz = new int[100][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i][1]) = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			y = 0;
			if ((sz[j][0] >= 90) && (sz[j][0] <= 140) && (sz[j][1] >= 60) && (sz[j][1] <= 90))
			{
				y++;
				for (a = j + 1;a < n;a++)
				{
					if ((sz[a][0] >= 90) && (sz[a][0] <= 140) && (sz[a][1] >= 60) && (sz[a][1] <= 90))
					{
						y++;
					}
					else
					{
						break;
					}
				}
			}
			if (y > max)
			{
				max = y;
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

