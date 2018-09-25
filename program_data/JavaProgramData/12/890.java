package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		int k;
		int[][] g = new int[1000][16];
		int o;
		for (i = 0;i <= 999;i++)
		{
			int s = 0;
			for (l = 0;l < 16;l++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					g[i][l] = Integer.parseInt(tempVar);
				}
				if (g[i][l] == 0)
				{
					break;
				}
			}
			if (g[i][0] == -1)
			{
				break;
			}
			for (o = 0;o < 14 && g[i][o]>0;o++)
			{
				for (k = o + 1;k < 15;k++)
				{
					if (g[i][k] - 2 * g[i][o] == 0 || g[i][o] - 2 * g[i][k] == 0)
					{
						s = s + 1;
					}
				}
			}
			System.out.printf("%d\n",s);
		}

	}
}

