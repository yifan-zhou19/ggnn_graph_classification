package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[25][25];
		int m;
		int n;
		int p;
		int q;
		int s = 0;
		int l;
		int f;
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
		for (p = 1;p < m + 1;p++)
		{
			for (q = 1;q < n + 1;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[p][q] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (l = 0;l < n + 2;l++)
		{
			a[0][l] = 0;
			a[m + 1][l] = 0;
		}
		for (f = 0;f < m + 2;f++)
		{
			a[f][0] = 0;
			a[f][n + 1] = 0;
		}
		for (p = 1;p < m + 1;p++)
		{
			for (q = 1;q < n + 1;q++)
			{
				if (a[p][q] < a[p - 1][q] || a[p][q] < a[p + 1][q] || a[p][q] < a[p][q + 1] || a[p][q] < a[p][q - 1])
				{
					continue;
				}
				else
				{
					System.out.printf("%d %d\n",p - 1,q - 1);
				}
			}
		}
		return 0;
	}
}

