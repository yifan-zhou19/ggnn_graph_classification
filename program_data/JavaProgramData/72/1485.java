package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[][] a = new int[25][25];
		int i;
		int j;
		char c;
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					c = tempVar4.charAt(0);
				}
			}
		}
		for (j = 0;j <= n + 1;j++)
		{
			a[0][j] = -1;
			a[m + 1][j] = -1;
		}
		for (i = 0;i <= m + 1;i++)
		{
			a[i][0] = -1;
			a[i][n + 1] = -1;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}


}

