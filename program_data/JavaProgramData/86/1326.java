package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int x;
		int y;
		int z;
		int i;
		int j;
		int w;
		int[][] a = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= a[i][0];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i][(a[i][0])] + a[i][0] * 3 <= 60)
			{
				w = 60 - a[i][0] * 3;
				System.out.printf("%d\n",w);
			}
			if ((a[i][(a[i][0])] + a[i][0] * 3 > 60) && (a[i][(a[i][0] - 1)] + (a[i][0] - 1) * 3 <= 60))
			{
				x = a[i][(a[i][0])] + a[i][0] * 3 - 3;
				if (x <= 60)
				{
					y = x;
				}
				if (x > 60)
				{
					y = 60;
				}
				w = y - (a[i][0] - 1) * 3;
				System.out.printf("%d\n",w);
			}
			if ((a[i][(a[i][0] - 1)] + (a[i][0] - 1) * 3 > 60) && (a[i][(a[i][0] - 2)] + (a[i][0] - 2) * 3 <= 60))
			{
				x = a[i][(a[i][0] - 1)] + (a[i][0] - 1) * 3 - 3;
				if (x <= 60)
				{
					y = x;
				}
				if (x > 60)
				{
					y = 60;
				}
				w = y - (a[i][0] - 2) * 3;
				System.out.printf("%d\n",w);
			}
		}
	}
}

