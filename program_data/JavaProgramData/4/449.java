package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[300][300];
		int r;
		int c;
		int m;
		int i;
		int j;
		int n;
		int k;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i <= r + c - 2;i++)
		{
			for (j = 0;;j++)
			{
				k = i - j;
				if (k < 0)
				{
					break;
				}
				if (j < r && k < c)
				{
					System.out.printf("%d\n",sz[j][k]);
				}
			}
		}
		return 0;
	}

}

