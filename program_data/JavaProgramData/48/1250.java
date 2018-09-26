package <missing>;

public class GlobalMembers
{
	public static int[][][] map = new int[11][11][4];
	public static int i;
	public static int j;
	public static int k;
	public static int Main()
	{
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(map,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		map[5][5][0] = m;
		   for (k = 1;k <= n;k++)
		   {
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
						map[i][j][k] = 2 * map[i][j][k - 1] + map[i - 1][j - 1][k - 1] + map[i - 1][j][k - 1] + map[i - 1][j + 1][k - 1] + map[i][j - 1][k - 1] + map[i][j + 1][k - 1] + map[i + 1][j - 1][k - 1] + map[i + 1][j][k - 1] + map[i + 1][j + 1][k - 1];
				}
			}
		   }
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
					if (j != 9)
					{
					System.out.printf("%d ",map[i][j][n]);
					}
				 else
				 {
					System.out.printf("%d\n",map[i][j][n]);
				 }
			}

		}


	}

}

