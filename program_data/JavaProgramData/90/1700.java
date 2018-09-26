package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int way = new int(int x,int y);
		int t;
		int i;
		int[] m = new int[100];
		int[] n = new int[100];
		int[] p = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
						  p[i] = way(m[i], n[i]);
						  System.out.printf("%d\n", p[i]);
		}
		return 0;
	}

	public static int way(int x,int y)
	{
		int[][] s = new int[100][100];
		int j;
		int k;
		int w = 0;
		for (j = 0;j <= 50;j++)
		{
			s[0][j] = 1;
			s[j][1] = 1;
			s[1][j + 1] = 1;
		}
		for (j = 2;j <= 50;j++)
		{
							for (k = 2;k <= 50;k++)
							{
											   if (k > j)
											   {
												   s[j][k] = s[j][k - 1];
											   }
											   else
											   {
												   s[j][k] = s[j][k - 1] + s[j - k][k];
											   }
							}
		}
		return (s[x][y]);
	}


}

