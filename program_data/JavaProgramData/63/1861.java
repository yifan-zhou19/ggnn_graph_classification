package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		int k;
		int[][] x = new int[101][101];
		int[][] y = new int[101][101];
		int[][] z = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		i = 0;
		while (i <= a - 1)
		{
			for (j = 0;j <= b - 1;j++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x[i][j] = Integer.parseInt(tempVar3);
		}
			}
		i++;
		}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				d = Integer.parseInt(tempVar5);
			}

		i = 0;
		while (i <= c - 1)
		{
			for (j = 0;j <= d - 1;j++)
			{
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			y[i][j] = Integer.parseInt(tempVar6);
		}
			}
		i++;
		}
			i = 0;
			while (i <= 100)
			{
				for (j = 0;j <= 100;j++)
				{
				z[i][j] = 0;
				}
				i++;
			}
			i = 0;
			while (i <= a - 1)
			{
				for (j = 0;j <= d - 1;j++)
				{
				k = 0;
				while (k <= b - 1)
				{
					z[i][j] = z[i][j] + x[i][k] * y[k][j];
				k++;
				}
				}
				i++;
			}
				i = 0;
				while (i <= a - 1)
				{
					for (j = 0;j <= d - 2;j++)
					{
				System.out.printf("%d ",z[i][j]);
					}
				System.out.printf("%d\n",z[i][j]);
				i++;
				}
	}
}

