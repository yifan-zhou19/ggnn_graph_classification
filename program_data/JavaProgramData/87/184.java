package <missing>;

public class GlobalMembers
{
	// kaoshi.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		int[][] sz = new int[1000][6];
		int i;
		int j;
		int k = 0;
		int s;
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
			if (sz[i][0] == 0 && sz[i][1] == 0 && sz[i][2] == 0 && sz[i][3] == 0 && sz[i][4] == 0 && sz[i][5] == 0)
			{
				break;
			}
			else
			{
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
		s = (sz[i][3] + 12 - sz[i][0]) * 3600 + (sz[i][4] * 60 + sz[i][5] - sz[i][1] * 60 - sz[i][2]);
		System.out.printf("%d\n",s);
		}
	}


}

