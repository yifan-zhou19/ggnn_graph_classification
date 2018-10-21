package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] t = new int[5];
		int m;
		int n;
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
		if (m < 5 && n < 5 && m>-1 && n>-1)
		{
			 for (j = 0;j < 5;j++)
			 {
				 t[j] = sz[m][j];
				 sz[m][j] = sz[n][j];
				 sz[n][j] = t[j];
			 }
			for (i = 0;i < 4;i++)
			{
			 for (j = 0;j < 4;j++)
			 {
				System.out.printf("%d ",sz[i][j]);
			 }
			 System.out.printf("%d\n",sz[i][4]);
			}
	for (j = 0;j < 4;j++)
	{
	System.out.printf("%d ",sz[4][j]);
	}
	System.out.printf("%d",sz[4][4]);
		}
	if (m > 4 || m < 0 || n>4 || n < 0)
	{
	System.out.print("error");
	}
	return 0;
	}
}

