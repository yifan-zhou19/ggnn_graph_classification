package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int j;
		int[][] sz = new int[100][6];
		int i = 0;
		while (true)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (sz[i][0] == 0 && sz[i][1] == 0 && sz[i][2] == 0 && sz[i][3] == 0 && sz[i][4] == 0 && sz[i][5] == 0)
			{
				break;
			}
			i++;
		}
		a = i;
		int[] s = new int[a];
		int m = 0;
		for (i = 0;i < a;i++)
		{
			if ((sz[i][0] >= 1) && (sz[i][0] <= 11) && (sz[i][3] >= 1) && (sz[i][3] <= 11) && (sz[i][1] >= 0) && (sz[i][1] <= 59) && (sz[i][2] >= 0) && (sz[i][2] <= 59) && (sz[i][4] >= 0) && (sz[i][4] <= 59) && (sz[i][5] >= 0) && (sz[i][5] <= 59))
			{
				b = sz[i][0] * 3600 + sz[i][1] * 60 + sz[i][2];
				c = (sz[i][3] + 12) * 3600 + (sz[i][4]) * 60 + sz[i][5];
				s[i] = c - b;
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}
}

