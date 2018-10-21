package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] juzhen = new int[M][M];
		int y;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		int i; //k=y'
		int j;
		int k;
		for (i = 0;i < y;i++)
		{
			for (j = 0;j < x;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					juzhen[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int max = 0;
		int maxy;
		int maxx;
		for (i = 0;i < y;i++)
		{
			for (j = 0;j < x;j++)
			{
				if (juzhen[i][j] > max)
				{
					maxy = i;
					maxx = j;
					max = juzhen[i][j];
				}
			}
			int jishu = 0;
			for (k = 0;k < y;k++)
			{
				if (juzhen[k][maxx] < juzhen[maxy][maxx])
				{
					break;
				}
				else
				{
					jishu++;
				}
				if (jishu == y)
				{
					System.out.printf("%d+%d",maxy,maxx);
					return 0;
				}
			}

		}
	if (i == y,j == x)
	{
		System.out.print("No");
	}
	return 0;
	}

}

