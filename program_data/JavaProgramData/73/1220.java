package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int x;
		int y;
		int[][] sz = new int[5][5];
		int[] z = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int m = 0;
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				if (sz[j][i] > sz[j][m])
				{
				   m = i;
				}
			}
			z[j] = m;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (sz[i][z[i]] > sz[j][z[i]])
				{
				   break;
				}
			}
			if (j == 5)
			{
			   n = n + 1;
			   x = i + 1;
			   y = z[i] + 1;
			   System.out.printf("%d %d %d",x,y,sz[i][z[i]]);

			}
		}
		if (n == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}
}

