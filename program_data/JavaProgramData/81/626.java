package <missing>;

public class GlobalMembers
{
	public static int p(int a)
	{
		if (a >= 0 && a <= 4)
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
		int[][] s = new int[5][5];
		int m;
		int n;
		int e;
		for (int i = 0;i <= 4;i++)
		{
			for (int j = 0;j < 5;j++)
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
		if (p(m) != 0 && p(n) != 0)
		{
			for (int t = 0;t < 5;t++)
			{
				e = s[m][t];
				s[m][t] = s[n][t];
				s[n][t] = e;
			}
			for (int a = 0;a < 5;a++)
			{
				for (int b = 0;b < 4;b++)
				{
					System.out.printf("%d ",s[a][b]);
				}
				System.out.printf("%d\n",s[a][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

