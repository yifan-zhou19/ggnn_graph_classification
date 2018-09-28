package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int[][] a = new int[100000][6];
		for (i = 0;i < 1000000;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (a[i][0] != 0)
			{
				if (a[i][5] >= a[i][2])
				{
					if (a[i][4] >= a[i][1])
					{
						x = 3600 * (12 + a[i][3] - a[i][0]) + 60 * (a[i][4] - a[i][1]) + (a[i][5] - a[i][2]);
					}
					else
					{
						x = 3600 * (11 + a[i][3] - a[i][0]) + 60 * (60 + a[i][4] - a[i][1]) + (a[i][5] - a[i][2]);
					}
				}
				else
				{
					if (a[i][4] > a[i][1])
					{
						x = 3600 * (12 + a[i][3] - a[i][0]) + 60 * (a[i][4] - 1 - a[i][1]) + (60 + a[i][5] - a[i][2]);
					}
					else if (a[i][4] <= a[i][1])
					{
						x = 3600 * (11 + a[i][3] - a[i][0]) + 60 * (59 + a[i][4] - a[i][1]) + (60 + a[i][5] - a[i][2]);
					}
				}
				System.out.printf("%d\n",x);
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

