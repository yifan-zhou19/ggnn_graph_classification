package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int tag = 0;
		int i;
		int j;
		int n;
		int[][] xy = new int[100][2];
		int[] sz = new int[2];
		sz[0] = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   xy[i][j] = Integer.parseInt(tempVar2);
			   }
			}
		}
		for (h = 0;h < n;h++)
		{
			if (xy[h][0] >= 90 && xy[h][0] <= 140 && xy[h][1] >= 60 && xy[h][1] <= 90)
			{
				  tag++;
			}
			else
			{
				if (sz[0] < tag)
				{
				sz[0] = tag;
				tag = 0;
				}
				else
				{
					tag = 0;
				}
			}
		}
		if (sz[0] < tag)
		{
			sz[0] = tag;
		}
		System.out.printf("%d",sz[0]);
		return 0;
	}
}

