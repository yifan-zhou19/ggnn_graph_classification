package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][6];
		int i;
		int q;
		int z;
		int x;
		int y;
		int m;
		for (i = 0;i < 100;i++)
		{
			for (q = 0;q < 6;q++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][q] = Integer.parseInt(tempVar);
				}
			}
			if (a[i][0] == 0 && a[i][1] == 0 & a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
			{
				m = i;
				break;
			}
		}
		for (i = 0;i < m;i++)
		{
			x = 3600 * a[i][0] + 60 * a[i][1] + a[i][2];
			y = 3600 * (a[i][3] + 12) + 60 * a[i][4] + a[i][5];
			z = y - x;
			System.out.printf("%d\n",z);
		}
		return 0;
	}

}

