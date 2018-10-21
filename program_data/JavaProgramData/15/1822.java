package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int n;
		int x1;
		int y1;
		int x2;
		int y2;
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
				if (a[i][j] == 0 && a[i][j + 1] == 0 && a[i + 1][j] == 0)
				{
					x1 = i;
					y1 = j;
				}
				if (a[i][j] == 0 && a[i][j - 1] == 0 && a[i - 1][j] == 0)
				{
					x2 = i;
					y2 = j;
				}
			}
		}
		System.out.printf("%d",(x2 - x1 - 1) * (y2 - y1 - 1));
		return 0;
	}




}

