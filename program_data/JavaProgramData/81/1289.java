package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int k;
		int r;
		int[][] sz = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (!(n >= 0 && n <= 4 && m >= 0 && m <= 4))
		{
		System.out.print("error");
		return 0;
		}
		else
		{
			m = n > m != 0?n:m;
			n = m < n != 0?m:n;
				for (i = n,k = i + 1;k < 5;k++)
				{
					if (k == m)
					{
						for (j = 0;j < 5;j++)
						{
						r = sz[i][j];
						sz[i][j] = sz[k][j];
						sz[k][j] = r;
						}
					}
				}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",sz[i][j]);
			}
			if (j == 4)
			{
					System.out.printf("%d\n",sz[i][j]);
			}
		}
		return 0;
	}




}

