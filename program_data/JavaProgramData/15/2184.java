package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1001][1001];
		int n;
		int i;
		int j;
		int k;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n - 2;j++)
			{
				if (a[i][j] == 0)
				{
					for (k = j + 1;k <= n;k++)
					{
						if (a[i][k] == 0)
						{
							s = s + (k - j - 1);
							break;
						}
					}
				}
			}
		}
		System.out.printf("%d",s);
		return 0;
	}
}

