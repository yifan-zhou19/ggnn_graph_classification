package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int m;
		int n;
		int k;
		int re = 0;
		int max;
		int tap = 0;
		for (i = 0;i < 5;i++)

		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}

		}


		for (i = 0;i < 5;i++)
		{
			k = 0;
			re = 0;
			max = a[i][0];
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					k = j;
				}
			}
				for (n = 0;n < 5;n++)
				{
					if (max > a[n][k])
					{
				re = 1;
					}



				}


		if (re == 0)
		{
			tap = 1;
			System.out.printf("%d %d %d",i + 1,k + 1,max);
		}
		}
		if (tap == 0)
		{
			System.out.print("not found");
		}


		return 0;

	}

}

