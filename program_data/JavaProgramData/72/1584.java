package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[22][22];

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
		for (int i = 1;i < m + 1;i++)
		{
			for (int t = 1;t < n + 1;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][t] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int p = 1;p < m + 1;p++)
		{
			for (int q = 1;q < n + 1;q++)
			{
				if (a[p][q] > (a[p - 1][q] - 1) && a[p][q] > (a[p + 1][q] - 1) && a[p][q] > (a[p][q - 1] - 1) && a[p][q] > (a[p][q + 1] - 1))
				{
	  System.out.printf("%d %d\n",p - 1,q - 1);
				}
			}
		}
					return 0;

	}
}

