package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int[][] a = new int[5][5];
		int j;
		int k;
		int n;
		int m;
		for (j = 0;j < 5;j++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[j][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if ((n < 5) && (m < 5))
		{
			for (k = 0;k < 5;k++)
			{
				a[n][k] = sz[n][k];
				sz[n][k] = sz[m][k];
				sz[m][k] = a[n][k];
			}
			for (j = 0;j < 5;j++)
			{
				for (k = 0;k < 5;k++)
				{
					if (k == 0)
					{
						System.out.printf("%d",sz[j][k]);
					}
					else if (k == 4)
					{
						System.out.printf(" %d\n",sz[j][k]);
					}
					else
					{
						System.out.printf(" %d",sz[j][k]);
					}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}


}

