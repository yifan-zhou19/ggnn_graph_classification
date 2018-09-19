package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[15][15];
		int i = 0;
		int j = 0;
		int s = 0;
		int m = 0;
		int h = 0;
		int[] g = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[15];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			if (a[i][j] == 0)
			{
				b[i] = j;
				i = i + 1;
				j = 0;

			}
			else if (a[i][j] == -1)
			{
				break;
			}
			else
			{
				j = j + 1;
			}
		}
		for (s = 0;s < i;s++)
		{
			for (m = 0;m < b[s];m++)
			{
				for (h = 0;h < b[s];h++)
				{
					if (a[s][m] == 2 * a[s][h])
					{
						g[s] = g[s] + 1;
					}
				}
			}
		}
		for (s = 0;s < i;s++)
		{
			System.out.printf("%d\n",g[s]);
		}
		return 0;
	}
}

