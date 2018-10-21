package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][16];
		int i;
		int j;
		int k;
		int s;
		int t;
		int[] d = new int[100];
		int q;
		int p;
		for (i = 0;;i++)
		{
			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				if (a[i][j] == 0 || a[i][j] == -1)
				{
					break;
				}
			}
			if (j == 0)
			{
				break;
			}
			s = 0;
			for (k = 0;k < j - 1;k++)
			{
				for (t = k + 1;t < j;t++)
				{
					p = a[i][t] - a[i][k] * 2;
					q = a[i][k] - a[i][t] * 2;
					if (p == 0 || q == 0)
					{
					   s++;
					}
				}
			}
			d[i] = s;
		}
		for (k = 0;k < i;k++)
		{
			System.out.printf("%d\n",d[k]);
		}
	}
}

