package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int zhan;
		int t;
		int you = 0;
		int pan;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] s = new int[n][m];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			zhan = s[i][0];
			t = 0;
			for (j = 1;j < m;j++)
			{
				if (s[i][j] > zhan)
				{
					zhan = s[i][j];
					t = j;
				}
			}
			pan = 1;
			for (j = 0;j < n;j++)
			{
				if (s[j][t] < s[i][t])
				{
					pan = 0;
				}
			}
			if (pan == 1)
			{
				System.out.printf("%d+%d\n",i,t);
				you = 1;
			}
		}
		if (you == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

