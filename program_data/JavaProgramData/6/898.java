package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void juzhen();
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			juzhen();
		}
	}

	public static void juzhen()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int f = 0;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			f = f + a[0][j] + a[m - 1][j];
		}
		for (i = 1;i < m - 1;i++)
		{
			f = f + a[i][0] + a[i][n - 1];
		}
		System.out.printf("%d\n",f);
	}

}

