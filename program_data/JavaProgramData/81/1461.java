package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int t;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		int converse = new int(int p,int q);

		if (converse(m, n) != 0)
		{
			for (j = 0;j < 5;j++)
			{
				t = s[m][j];
				s[m][j] = s[n][j];
				s[n][j] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j != 4)
					{
					System.out.printf("%d ",s[i][j]);
					}
					if (j == 4)
					{
					System.out.printf("%d\n",s[i][j]);
					}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

	public static int converse(int p,int q)
	{
		int t;
		if (p < 0 || p>4 || q < 0 || q>4)
		{
			return t = 0;
		}
		else
		{
			return t = 1;
		}
	}
}

