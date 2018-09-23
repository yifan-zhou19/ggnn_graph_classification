package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int c;
		int b;
		int sum = 0;
		int i;
		int[][] a = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
			for (y = 0;y < n;y++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[x][y] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (x = 0;x < n;x++)
		{
			for (y = 0;y < n;y++)
			{
				if (a[x][y] == 0)
				{
					b = y;
					break;
				}
			}
		}
		for (x = 0;x < n;x++)
		{
			for (y = 0;y < n;y++)
			{
				if (a[x][y] == 0)
				{
					c = y;
					sum++;
				}
			}
		}
		i = (sum - 2 * (c - b - 1)) / 2 * (c - b + 1) - sum;
		System.out.printf("%d",i);
		return 0;
	}
}

