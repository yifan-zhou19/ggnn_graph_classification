package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][6];
		int[] result = new int[1000];
		int i;
		int j;
		int p = 1;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (sz[i][0] != 0)
			{
				result[i] = (sz[i][3] - sz[i][0]) * 60 * 60 + (sz[i][4] - sz[i][1]) * 60 + sz[i][5] - sz[i][2] + 12 * 60 * 60;
				System.out.printf("%d\n",result[i]);
			}
			if (sz[i][0] == 0)
			{
				p = 0;
				break;
			}
		}
		return 0;
	}
}

