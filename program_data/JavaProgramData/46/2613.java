package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[] c = {-1, 0, 1, 0};
		int[] d = {0, 1, 0, -1};
		int m;
		int n;
		int i;
		int j;
		int x;
		int y;
		int t;
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				b[i][j] = 1;
			}
		}
		x = y = t = 1;
		for (i = 1;i <= m * n;i++)
		{
			System.out.printf("%d\n",a[x][y]);
			b[x][y] = 0;
			if (b[x + c[t]][y + d[t]] == 0)
			{
				t = (t + 1) % 4;
			}
			x += c[t];
			y += d[t];
		}
		return 0;
	}

}

