package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int m;
		int p;
		int a;
		int b;
		int[][] sz = new int[5][5];
		for (k = 0;k < 5;k++)
		{
				for (i = 0;i < 5;i++)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						(sz[k][i]) = Integer.parseInt(tempVar);
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
		if (n < 5 && m < 5)
		{
				for (i = 0;i < 5;i++)
				{
				   a = sz[m][i];
				   b = sz[n][i];
				   sz[m][i] = b;
				   sz[n][i] = a;
				}
				for (k = 0;k < 5;k++)
				{
				for (i = 0;i < 5;i++)
				{
					if (i < 4)
					{
					System.out.printf("%d ",sz[k][i]);
					}
					else if (i == 4)
					{
						System.out.printf("%d\n",sz[k][i]);
					}
				}
				}
		}
		else if (n > 4 || m > 4)
		{
				System.out.print("error");
		}
		return 0;
	}

}

