package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n = 0;
		int m;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n][0] = Integer.parseInt(tempVar);
			}
			if (a[n][0] == -1)
			{
				break;
			}
			for (j = 1;;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[n][j] = Integer.parseInt(tempVar2);
				}
				if (a[n][j] == 0)
				{
					m = j;
					break;
				}
			}
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < m;k++)
				{
					if (a[n][j] == 2 * a[n][k])
					{
						b[n]++;
					}
				}
			}
			System.out.printf("%d\n",b[n]);
			n++;
		}
		return 0;
	}
}

