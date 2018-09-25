package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[40][40];
		int[][] b = new int[40][40];
		int m;
		int n;
		int m1;
		int n1;
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
		for (m1 = 1; m1 <= m; m1++)
		{
			for (n1 = 1; n1 <= n; n1++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[m1][n1] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (m1 = 1; m1 <= m; m1++)
		{
			for (n1 = 1; n1 <= n; n1++)
			{
				if (a[m1][n1] >= a[m1 - 1][n1] != 0 && a[m1][n1] >= a[m1][n1 - 1] != 0 && a[m1][n1] >= a[m1][n1 + 1] != 0 && a[m1][n1] >= a[m1 + 1][n1])
				{
					b[m1][n1] = 1;
				}
			}
		}

		for (m1 = 1; m1 <= m; m1++)
		{
			for (n1 = 1; n1 <= n; n1++)
			{
				if (b[m1][n1] == 1)
				{
					System.out.printf("%d %d\n",m1 - 1,n1 - 1);
				}
			}
		}
	}
}

