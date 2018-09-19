package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][16];
		int i;
		int j;
		int m;
		int p;
		int q;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 16;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				if (a[i][j] <= 0)
				{
					break;
				}
			}
			m = 0;
			for (p = 0;p < j;p++)
			{
				for (q = 0;q < j;q++)
				{
					if (a[i][q] == 2 * a[i][p])
					{
						m++;
					}
				}
			}
			if (a[i][j] == -1)
			{
				break;
			}
			System.out.printf("%d\n",m);

		}
		return 0;
	}
}

