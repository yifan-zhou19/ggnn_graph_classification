package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][6];
		int s;
		int i;
		int j;
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 11;i++)
		{
			if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
			{
				break;
			}
		s = 3600 * (a[i][3] + 11 - a[i][0]) + 3600 - 60 * a[i][1] - a[i][2] + 60 * a[i][4] + a[i][5];
		System.out.printf("%d\n",s);

		}
		return 0;
	}
}

