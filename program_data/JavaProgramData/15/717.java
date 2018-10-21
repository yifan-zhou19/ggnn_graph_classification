package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int n;
		int i = 0;
		int j = 0;
		int x1;
		int y1;
		int x2;
		int y2;
		int x;
		int y;
		int s;
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
					x1 = x;
					y1 = y;
					i = 1;
					break;
				}
			}
			if (i == 1)
			{
				break;
			}
			else
			{
				;
			}
		}
		for (x = n - 1;x >= 0;x--)
		{
			for (y = n - 1;y >= 0;y--)
			{
				if (a[x][y] == 0)
				{
					x2 = x;
					y2 = y;
					j = 1;
					break;
				}
			}
			if (j == 1)
			{
				break;
			}
			else
			{
				;
			}
		}
		s = (y2 - y1 - 1) * (x2 - x1 - 1);
		System.out.printf("%d",s);
		return 0;
	}






}

