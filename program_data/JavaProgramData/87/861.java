package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][7];
		int i;
		int j;
		int s;
		for (i = 0;;i++)
		{
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}
			if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
			{
				break;
			}
			s = (a[i][3] + 12 - a[i][0]) * 60 * 60 + (a[i][4] - a[i][1]) * 60 + (a[i][5] - a[i][2]);
			System.out.printf("%d\n",s);
		}
			return 0;
	}


}

