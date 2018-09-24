package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (i = 0;i < m + n - 1;i++)
		{
				for (j = 0;j < m;j++)
				{
						if (i - j >= 0 && i - j < n)
						{
							System.out.printf("%d\n",a[j][i - j]);
						}
				}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		return 0;
	}

}

