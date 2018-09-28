package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int x;
		int y;
		int pos;
		int[][] p = new int[200][200];
		int[][] a = new int[200][200];
		int[][] f = new int[10][2];
		f[0][0] = 0;
		f[0][1] = 1;
		f[1][0] = 1;
		f[1][1] = 0;
		f[2][0] = 0;
		f[2][1] = -1;
		f[3][0] = -1;
		f[3][1] = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				p[i][j] = 1;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		x = 1;
		y = 1;
		pos = 0;
		for (i = 1;i <= n * m;i++)
		{
			System.out.printf("%d\n",a[x][y]);
			p[x][y] = 0;
			if (p[x + f[pos][0]][y + f[pos][1]] == 0)
			{
			  pos = (pos + 1) % 4;
			}
			x = x + f[pos][0];
			y = y + f[pos][1];
		}
	}
}

