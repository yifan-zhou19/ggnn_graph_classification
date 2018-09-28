package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] num = new int[11][11][11];
		int days;
		int pi;
		int pj;
		int n;
		int m;
		int i;
		int j;
		int k;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			days = Integer.parseInt(tempVar2);
		}
		num[5][5][1] = m;
		for (n = 2;n <= days + 1;n++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (num[i][j][n - 1] > 0)

					{
						b = num[i][j][n - 1];
		num[i][j][n] = num[i][j][n] + b;
		for (pi = 1;pi <= 3;pi++)
		{
			for (pj = 1;pj <= 3;pj++)
			{
				num[i - 2 + pi][j - 2 + pj][n] = num[i - 2 + pi][j - 2 + pj][n] + b;
			}
		}
					}
				}
			}
		}



			for (i = 1;i <= 9;i++)
			{
			for (j = 1;j <= 8;j++)
			{
				System.out.printf("%d ",num[i][j][days + 1]);
			}
			System.out.printf("%d\n",num[i][9][days + 1]);
			}


	}

}

