package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int s = 0;
		int x;
		int y;
		int[][] a = new int[6][6];
		int max = 0;
		int min = 1000000;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					x = j;
				}
			}
			for (j = 1;j <= 5;j++)
			{
				if (a[j][x] < min)
				{
					min = a[j][x];
					y = j;
				}
			}
			if (min == max)
			{
				System.out.printf("%d %d %d\n",y,x,max);
				s = s + 1;
			}
			max = 0;
			min = 1000000;
		}
		if (s == 0)
		{
		System.out.print("not found");
		}
		return 0;
	}
}

