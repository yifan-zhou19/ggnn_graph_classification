package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i1;
		int i2;
		int i3;
		int j;
		int total;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i1 = 1;i1 <= k;i1++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			total = 0;
			for (i2 = 0;i2 <= m - 1;i2++)
			{
				String tempVar4 = ConsoleInput.scanfRead("\n");
				if (tempVar4 != null)
				{
					a[i2][0] = Integer.parseInt(tempVar4);
				}
				for (i3 = 1;i3 <= n - 1;i3++)
				{
					String tempVar5 = ConsoleInput.scanfRead(" ");
					if (tempVar5 != null)
					{
						a[i2][i3] = Integer.parseInt(tempVar5);
					}
				}
			} //input

			if (m == 1 && n == 1)
			{
				total = a[0][0];
				System.out.printf("%d\n",total);
				continue;
			}
			for (i2 = 0;i2 <= n - 1;i2++)
			{
				total = total + a[0][i2] + a[m - 1][i2];
			}
			for (i2 = 0;i2 <= m - 1;i2++)
			{
				total = total + a[i2][0] + a[i2][n - 1];
			}
			total = total - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1];

			System.out.printf("%d\n",total);


		}
	}
}

