package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int a;
		int b;
		int c;
		int[][] sz = new int[5][5];
		int[] ss = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][k] = Integer.parseInt(tempVar);
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
		if (n < 5 && n >= 0 && m >= 0 && m < 5)
		{
			for (a = 0;a < 5;a++)
			{
				ss[a] = sz[n][a];
				sz[n][a] = sz[m][a];
				sz[m][a] = ss[a];
			}
			for (b = 0;b < 5;b++)
			{
				for (c = 0;c < 4;c++)
				{
					System.out.printf("%d ",sz[b][c]);
				}
				System.out.printf("%d\n",sz[b][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

