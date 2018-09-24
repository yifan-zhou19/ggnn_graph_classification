package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][16];
		int i;
		int j;
		int k;
		int t;
		for (i = 0; ; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			if (a[i][0] == -1)
			{
				break;
			}
			for (j = 1; a[i][j - 1] != 0; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (j = 0; j < i; j++)
		{
			int n = 0;
			for (k = 0; a[j][k + 1] != 0; k++)
			{
				for (t = k + 1; a[j][t] != 0; t++)
				{
					if (a[j][k] == 2 * a[j][t] || a[j][t] == 2 * a[j][k])
					{
						n++;
					}
				}
			}
			System.out.printf("%d\n", n);
		}
		return 0;
	}

}

