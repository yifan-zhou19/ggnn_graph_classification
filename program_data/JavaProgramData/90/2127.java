package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (l = 0;l < t;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			int[][] a = new int[100][100];
			for (i = 1;i <= m;i++)
			{
			for (j = 1;j <= n;j++)
			{
				if (i == 1)
				{
					a[i][j] = 1;
				}
				else if (j == 1)
				{
					a[i][j] = 1;
				}
				else if (i == j)
				{
					a[i][j] = a[i][j - 1] + 1;
				}
				else if (i < j)
				{
					a[i][j] = a[i][j - 1];
				}
				else if (j < i)
				{
					a[i][j] = a[i][j - 1] + a[i - j][j];
				}
			}
			}
			System.out.printf("%d\n",a[m][n]);
		}
	}
}

