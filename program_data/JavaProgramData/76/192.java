package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[50000][2];
		int i;
		int j;
		int x;
		int y;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		x = a[0][0];
		y = a[0][0];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				if (a[i][j] < x)
				{
					x = a[i][j];
				}
				if (a[i][j] > y)
				{
					y = a[i][j];
				}
			}
		}
		b = 1.0 * x + 0.5;
		int s = 0;
		int z = 0;
		for (i = x;i < y;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b > 1.0 * a[j][0] && b < 1.0 * a[j][1])
				{
					s = s + 1;
				}

			}
			b = b + 1;
			if (s == 0)
			{
				z = z + 1;
			}
			s = 0;
		}

		if (z == 0)
		{
			System.out.printf("%d %d\n",x,y);
		}
		else
		{
			System.out.print("no\n");
		}

		return 0;
	}
}

