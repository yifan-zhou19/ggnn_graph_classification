package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int i;
		int j;
		int k;
		int x;
		int y;
		int[][] a = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int max = a[0][0];
		int min = a[0][0];
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				if (a[i][j] >= max)
				{
					max = a[i][j];
					min = max;
					x = j;
				}
			}
		for (k = 0;k < r;k++)
		{
					if (a[k][x] <= min)
					{
						min = a[k][x];
						y = k;
					}
		}
				if (max == min)
				{
					System.out.printf("%d+%d",y,x);
				return 0;
				}
		}
		System.out.print("No");
		return 0;
	}
}

