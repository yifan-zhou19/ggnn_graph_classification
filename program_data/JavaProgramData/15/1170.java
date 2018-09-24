package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int[] lup = new int[2];
		int[] ldown = new int[2];
		int[] rup = new int[2];
		int[] rdown = new int[2];
		int area;
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
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (a[i - 1][j - 1] == 255 && a[i - 1][j] == 255 && a[i][j - 1] == 255 && a[i][j] == 0)
				{
					lup[0] = i;
					lup[1] = j;
				}
				if (a[i + 1][j + 1] == 255 && a[i + 1][j] == 255 && a[i][j + 1] == 255 && a[i][j] == 0)
				{
					rdown[0] = i;
					rdown[1] = j;
				}
				if (a[i - 1][j + 1] == 255 && a[i - 1][j] == 255 && a[i][j + 1] == 255 && a[i][j] == 0)
				{
					ldown[0] = i;
					ldown[1] = j;
				}
				if (a[i + 1][j - 1] == 255 && a[i + 1][j] == 255 && a[i][j - 1] == 255 && a[i][j] == 0)
				{
					rup[0] = i;
					rup[1] = j;
				}
			}
		}
		area = (rup[0] - lup[0] - 1) * (rdown[1] - rup[1] - 1);
		System.out.printf("%d", area);
	}
}

