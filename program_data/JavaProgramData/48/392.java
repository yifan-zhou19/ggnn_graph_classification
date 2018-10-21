package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] juzhen1 = new int[11][11];
		int[][] juzhen2 = new int[11][11];
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
		for (i = 0;i < 11;i++)
		{
		  for (j = 0;j < 11;j++)
		  {
			juzhen1[i][j] = 0;
			juzhen2[i][j] = 0;

		  }
		}
		juzhen1[5][5] = m;
		for (k = 1;k < n + 1;k++)
		{
		  for (i = 1;i < 10;i++)
		  {
			for (j = 1;j < 10;j++)
			{
			  if (k % 2 != 0)
			  {
				if (juzhen1[i][j] > 0)
				{
				  juzhen2[i][j] = juzhen2[i][j] + 2 * (juzhen1[i][j]);
				  juzhen2[i - 1][j - 1] = juzhen2[i - 1][j - 1] + juzhen1[i][j];
				  juzhen2[i - 1][j] = juzhen2[i - 1][j] + juzhen1[i][j];
				  juzhen2[i - 1][j + 1] = juzhen2[i - 1][j + 1] + juzhen1[i][j];
				  juzhen2[i][j - 1] = juzhen2[i][j - 1] + juzhen1[i][j];
				  juzhen2[i][j + 1] = juzhen2[i][j + 1] + juzhen1[i][j];
				  juzhen2[i + 1][j - 1] = juzhen2[i + 1][j - 1] + juzhen1[i][j];
				  juzhen2[i + 1][j] = juzhen2[i + 1][j] + juzhen1[i][j];
				  juzhen2[i + 1][j + 1] = juzhen2[i + 1][j + 1] + juzhen1[i][j];
				  //juzhen1[i][j]=0;
				}
			  }
			  if (k % 2 == 0)
			  {
				if (juzhen2[i][j] > 0)
				{
				  juzhen1[i][j] = juzhen1[i][j] + 2 * (juzhen2[i][j]);
				  juzhen1[i - 1][j - 1] = juzhen1[i - 1][j - 1] + juzhen2[i][j];
				  juzhen1[i - 1][j] = juzhen1[i - 1][j] + juzhen2[i][j];
				  juzhen1[i - 1][j + 1] = juzhen1[i - 1][j + 1] + juzhen2[i][j];
				  juzhen1[i][j - 1] = juzhen1[i][j - 1] + juzhen2[i][j];
				  juzhen1[i][j + 1] = juzhen1[i][j + 1] + juzhen2[i][j];
				  juzhen1[i + 1][j - 1] = juzhen1[i + 1][j - 1] + juzhen2[i][j];
				  juzhen1[i + 1][j] = juzhen1[i + 1][j] + juzhen2[i][j];
				  juzhen1[i + 1][j + 1] = juzhen1[i + 1][j + 1] + juzhen2[i][j];
				  //juzhen2[i][j]=0;
				}
			  }
			}
		  }
		  if (k % 2 != 0)
		  {
			for (i = 1;i < 10;i++)
			{
			  for (j = 1;j < 10;j++)
			  {
				juzhen1[i][j] = 0;
			  }
			}
		  }
		  if (k % 2 == 0)
		  {
			for (i = 1;i < 10;i++)
			{
			  for (j = 1;j < 10;j++)
			  {
				juzhen2[i][j] = 0;
			  }
			}
		  }
		}
		if (k % 2 == 0)
		{
		  for (i = 1;i < 10;i++)
		  {
			System.out.printf("%d %d %d %d %d %d %d %d %d\n",juzhen2[i][1],juzhen2[i][2],juzhen2[i][3],juzhen2[i][4],juzhen2[i][5],juzhen2[i][6],juzhen2[i][7],juzhen2[i][8],juzhen2[i][9]);
		  }
		}
		if (k % 2 != 0)
		{
		  for (i = 1;i < 10;i++)
		  {
			System.out.printf("%d %d %d %d %d %d %d %d %d\n",juzhen1[i][1],juzhen1[i][2],juzhen1[i][3],juzhen1[i][4],juzhen1[i][5],juzhen1[i][6],juzhen1[i][7],juzhen1[i][8],juzhen1[i][9]);
		  }
		}
		return 0;
	}
}

