package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = i;
					y1 = j;
					break;
				}
				else
				{
					;
				}
			}
			if (a[x1][y1] == 0)
			{
				break;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (a[i][j] == 0)
				{
					x2 = i;
					y2 = j;
					break;
				}
				else
				{
					;
				}
			}
			if (a[i][j] == 0)
			{
				break;
			}
			else
			{
				;
			}
		}
		 m = (y2 - y1 + 1 - 2) * (x2 - x1 + 1 - 2);
		 System.out.printf("\n%d",m);
		 return 0;

	}
}

