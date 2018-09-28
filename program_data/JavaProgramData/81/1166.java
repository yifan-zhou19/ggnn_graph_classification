package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int sushu(int a);
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] sz = new int[5][5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m > 4 || m < 0 || n>4 || n < 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i <= 4;i++)
			{
				j = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = j;
			}
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 4;j++)
				{
					if (j != 4)
					{
						System.out.printf("%d ",sz[i][j]);
					}
					if (j == 4)
					{
						System.out.printf("%d\n",sz[i][j]);
					}
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

