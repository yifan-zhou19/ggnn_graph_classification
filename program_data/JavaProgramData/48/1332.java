package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("""");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][][] num = new int[5][9][9];
		int i;
		int j;
		int k;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					num[i][j][k] = 0;
				}
			}
		}
		num[0][4][4] = m;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					if (num[i][j][k] != 0)
					{
						a = num[i][j][k];
						num[i + 1][j][k + 1] = num[i + 1][j][k + 1] + a;
						num[i + 1][j][k - 1] = num[i + 1][j][k - 1] + a;
						num[i + 1][j][k] = num[i + 1][j][k] + 2 * a;
						num[i + 1][j + 1][k - 1] = num[i + 1][j + 1][k - 1] + a;
						num[i + 1][j + 1][k + 1] = num[i + 1][j + 1][k + 1] + a;
						num[i + 1][j + 1][k] = num[i + 1][j + 1][k] + a;
						num[i + 1][j - 1][k + 1] = num[i + 1][j - 1][k + 1] + a;
						num[i + 1][j - 1][k - 1] = num[i + 1][j - 1][k - 1] + a;
						num[i + 1][j - 1][k] = num[i + 1][j - 1][k] + a;
					}
				}
			}
		}
		for (j = 0;j < 9;j++)
		{
			for (k = 0;k < 8;k++)
			{
				System.out.printf("%d ",num[n][j][k]);
			}
			System.out.printf("%d\n",num[n][j][8]);
		}
	}


}

