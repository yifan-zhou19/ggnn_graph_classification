package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int i;
		int k;
		int x = 0;
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
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][k] = Integer.parseInt(tempVar2);
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		for (k = 0;k < n;k++)
		{
			if ((a[i][k] == 0) && (a[i][k - 1] == 255) && (a[i - 1][k - 1] == 255) && (a[i - 1][k] == 255))
			{
			x1 = i;
			y1 = k;
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		for (k = 0;k < n;k++)
		{
			if ((a[i][k] == 0) && (a[i][k + 1] == 255) && (a[i + 1][k + 1] == 255) && (a[i + 1][k] == 255))
			{
			x2 = i;
			y2 = k;
			}
		}
	}
	System.out.printf("%d",(x2 - x1 - 1) * (y2 - y1 - 1));
	return 0;
	}
}

