package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m = 0;
		int k = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[1000][1000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					m = m + 1;
				}
			}
			if (m != 0)
			{
				break;
			}
		}
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n;i++)
				{
					if (a[i][j] == 0)
					{
						k = k + 1;

					}
				}
				if (k != 0)
				{
					break;
				}
			}
				p = m * k - 2 * m - 2 * k + 4;
				System.out.printf("%d\n",p);

		return 0;
	}


}

