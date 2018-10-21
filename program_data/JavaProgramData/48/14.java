package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[][] num = new int[11][11];
		int[][] tem = new int[11][11];
		int j;
		int k;
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				num[i][j] = 0;
				tem[i][j] = 0;
			}
		}
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
		num[5][5] = m;
		tem[5][5] = m;
		for (i = 1;i <= n;i++) //i????
		{
			for (j = 5 - i;j <= 5 + i;j++)
			{
				for (k = 5 - i;k <= 5 + i;k++)
				{
					num[j][k] = tem[j - 1][k - 1] + tem[j][k - 1] + tem[j + 1][k - 1] + tem[j - 1][k] + tem[j + 1][k] + tem[j + 1][k + 1] + tem[j][k + 1] + tem[j - 1][k + 1] + 2 * tem[j][k];
				}
			}
			for (j = 5 - i;j <= 5 + i;j++)
			{
				for (k = 5 - i;k <= 5 + i;k++)
				{
					tem[j][k] = num[j][k];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.printf("%d ",num[j][i]);
			}
			System.out.printf("%d\n",num[9][i]);
		}
		return 0;
	}






}

