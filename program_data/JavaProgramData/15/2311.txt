package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[1001][1001];
		int i;
		int j;
		int temp = 0;
		int c1;
		int c2;
		int d1;
		int d2;
		int f1;
		int f2;
		int g1;
		int g2;
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
					c1 = i;
					c2 = j;
				}
				if (a[i][j] == 0 && a[i][j - 1] == 0 && a[i + 1][j] == 0)
				{
					d1 = i;
					d2 = j;
				}
				if (a[i][j] == 0 && a[i - 1][j] == 0 && a[i][j + 1] == 0)
				{
					f1 = i;
					f2 = j;
				}
				if (a[i][j] == 0 && a[i][j - 1] == 0 && a[i - 1][j] == 0)
				{
					g1 = i;
					g2 = j;
				}
			}
		}
			temp = (d2 - c2 - 1) * (f1 - c1 - 1);
			System.out.printf("%d",temp);




			return 0;
	}
}

