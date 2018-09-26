package <missing>;

public class GlobalMembers
{
	public static int has(int n,int m)
	{
		if ((0 <= n) && (n < 5) && (0 <= m) && (m < 5))
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
		int i;
		int r;
		int m;
		int n;
		int[][] s = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (r = 0;r < 5;r++)
			{
				if (r < 4)
				{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][r] = Integer.parseInt(tempVar);
				}
				}
				if (r == 4)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][r] = Integer.parseInt(tempVar2);
				}
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		if (has(m, n) != 0)
		{
			int tmp;
			for (i = 0;i < 5;i++)
			{
				tmp = s[m][i];
				s[m][i] = s[n][i];
				s[n][i] = tmp;
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d\n",s[i][0],s[i][1],s[i][2],s[i][3],s[i][4]);
			}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}

}

