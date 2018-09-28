package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int m;
		int n;
		int i;
		int j;
		int y;
		int t;
		int c;
		int d;
		int[][] a = new int[10][10];
		int h;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	   u = 0;
		for (i = 0;i < m;i++)
		{
			max = a[i][0];
			y = 1;
			h = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
				 h = 1;
					max = a[i][j];
			   c = i;
			   d = j;
				}
			}
				if (h == 0)
				{
					c = i;
					d = 0;
				}
			for (t = 0;t < m;t++)
			{
				if (a[t][d] < max)
				{
				y = 0;
				break;
				}
			}
			if (y == 1)
			{
				System.out.printf("%d+%d",c,d);
				u = 1;
			}
		}
				if (u == 0)
				{
					System.out.print("No");
				}

	}
}

