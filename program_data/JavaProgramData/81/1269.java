package <missing>;

public class GlobalMembers
{
	public static int change(int n,int m)
	{
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] sz = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (change(n, m) == 0)
		{
			System.out.print("error");
		}
		else if (change(n, m) == 1)
		{
					  int[][] s = new int[5][5];
			int i;
			int j;
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					s[i][j] = sz[i][j];
				}
			}
			for (i = 0;i < 5;i++)
			{
				s[n][i] = sz[m][i];
				s[m][i] = sz[n][i];
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d\n",s[i][0],s[i][1],s[i][2],s[i][3],s[i][4]);

			}
		}
		return 0;
	}
}

