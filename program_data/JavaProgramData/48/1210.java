package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] s = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int n;
		int i;
		int t;
		int q;
		int a;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 9;i++)
		{
			for (t = 0;t < 9;t++)
			{
				s[i][t] = 0;
				b[i][t] = 0;
			}
		}
		s[4][4] = 1;
		for (q = 0;q < n;q++)
		{
			for (i = 0;i < 9;i++)
			{
				for (t = 0;t < 9;t++)
				{
					if (s[i][t] > 0)
					{
						a = s[i][t];
						for (x = i - 1;x <= i + 1;x++)
						{
							for (y = t - 1;y <= t + 1;y++)
							{
							b[x][y] += a;
							}
						}
						b[i][t] += a;
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
			   for (t = 0;t < 9;t++)
			   {
				   s[i][t] = b[i][t];
				   b[i][t] = 0;
			   }
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (t = 0;t < 9;t++)
			{
				if (t == 0)
				{
					System.out.printf("%d",s[i][t] * m);
				}
					else
					{
						System.out.printf(" %d",s[i][t] * m);
					}
			}
			System.out.print("\n");
		}
	}

}

