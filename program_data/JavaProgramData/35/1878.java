package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10][10];
	public static int m;
	public static int n;
	public static int maxh(int h)
	{
		int i;
		int max;
		int r;
		max = a[h][0];
		r = 0;
		for (i = 1;i < n;i++)
		{
			if (max < a[h][i])
			{
				max = a[h][i];
				r = i;
			}
		}
		return (r);
	}
	public static int min(int x)
	{
		int i;
		int r;
		int min;
		min = a[0][x];
		r = 0;
		for (i = 1;i < m;i++)
		{
			if (min > a[i][x])
			{
				min = a[i][x];
				r = i;
			}
		}
		return (r);
	}
	public static void Main()
	{
		int h;
		int l;
		int x;
		int y;
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
		for (h = 0;h < m;h++)
		{
			for (l = 0;l < n;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[h][l] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (h = 0;h < m;h++)
		{
			x = maxh(h);
			y = min(x);

			if (h == y)
			{
				System.out.printf("%d+%d",h,x);
				break;
			}

			else if (h == m - 1)
			{
				System.out.print("No");
			}
		}
	}
}

