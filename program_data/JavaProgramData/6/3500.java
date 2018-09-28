package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (i = 0;i < p;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			sum = 0;
			for (j = 1;j <= m;j++)
			{
				for (k = 1;k <= n;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
		   if (m == 1 && n == 1)
		   {
				System.out.printf("%d\n",a[1][1]);
				break;
		   }
			for (k = 1;k <= n;k++)
			{
				sum += a[1][k] + a[m][k];
			}
			for (j = 1;j <= m;j++)
			{
				sum += a[j][1] + a[j][n];
			}
			sum -= a[1][1] + a[1][n] + a[m][1] + a[m][n];
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

