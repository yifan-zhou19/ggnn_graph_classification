package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sum = new int[10000];
		int[][] a = new int[100][100];
		int k;
		int[] p = sum;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < x;i++)
			{
				for (j = 0;j < y;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (x != 1)
			{
				for (j = 0;j < y;j++)
				{
					p[k] += a[0][j] + a[x - 1][j];
				}
				for (i = 1;i < x - 1;i++)
				{
					p[k] += a[i][0] + a[i][y - 1];
				}
			}
			else
			{
				for (j = 0;j < y;j++)
				{
					p[k] += a[0][j];
				}
			}
		}
		for (;p < (sum + n);p++)
		{
			System.out.printf("%d\n",p[0]);
		}
		return 0;
	}

}

