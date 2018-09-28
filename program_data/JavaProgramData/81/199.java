package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int p;
	public static int m;
	public static int n;
	public static int han(int m, int n, int[][] sz)
	{

		if (0 <= m != 0 && m <= 4 && 0 <= n != 0 && n <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				p = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = p;
			}
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
		int c;
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
	  c = han(m, n, s);
		if (c == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ",s[i][j]);
					}
					else
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

}

