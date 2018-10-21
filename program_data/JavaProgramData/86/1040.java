package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int w;
		int[][] cs = new int[100][100];
		int r;
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
				w = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < w;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					cs[i][j] = Integer.parseInt(tempVar3);
				}
			}
			if (cs[i][j - 1] + 3 * w <= 60)
			{
				r = 60 - 3 * w;
			}
			else if (cs[i][j - 1] + 3 * w > 60 && cs[i][j - 2] + 3 * w <= 60)
			{
				if (cs[i][j - 1] + 3 * w - 60 > 3)
				{
					r = 60 - 3 * (w - 1);
				}
				else
				{
					r = cs[i][j - 1];
				}
			}
			else if (cs[i][j - 01] + 3 * w > 60 && cs[i][j - 2] + 3 * (w - 1) > 60)
			{
				if (cs[i][j - 2] + (w - 2) * 3 < 60)
				{
					r = cs[i][j - 2];
				}
				else
				{
					r = 60 - (w - 2) * 3;
				}
			}
			System.out.printf("%d\n", r);
		}
		return 0;
	}


}

