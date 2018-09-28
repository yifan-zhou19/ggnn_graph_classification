package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] t = new int[10000][6];
		int T;
		for (i = 0;;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					t[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (t[i][0] == 0)
			{
				return 0;
			}
			T = (t[i][3] + 12 - t[i][0]) * 3600 + t[i][4] * 60 + t[i][5] - t[i][1] * 60 - t[i][2];
			System.out.printf("%d\n",T);
		}
	}



}

