package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
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
		for (i = 1;i < n - 1;i++)

		{
			for (j = 1;j < n - 1;j++)
			{
				if (a[i - 1][j - 1] == 0 && a[i - 1][j] == 0 && a[i][j - 1] == 0)
				{
					x1 = i;
					y1 = j;
				}
				if (a[i + 1][j + 1] == 0 && a[i + 1][j] == 0 && a[i][j + 1] == 0)
				{
					x2 = i;
					y2 = j;
				}
			}
			num = (x2 - x1 + 1) * (y2 - y1 + 1);
		}
		System.out.printf("%d",num);
		return 0;
	}
}

