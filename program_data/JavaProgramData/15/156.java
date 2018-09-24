package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] p = new int[1000][1000];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int m = 0;
		int l = 0;
		int t = 0;
		int L;
		int h;
		int S;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			int x;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			p[i][j] = x;
			}
		}
		int a;
		int b;
		for (a = 0;a < n;a++)
		{
			if (p[a][0] != 0)
			{
			for (b = 1;b < n;b++)
			{
			if (p[a][b] == 0)
			{
				m = m + 1;
			}
			if (p[a][b] != p[a][b - 1])
			{
				l = l + 1;
			}
			}
			h = (l - 4) / 4;
			L = (m - 2 * h - 4) / 2;
			}
			else
			{
			for (b = 0;b < n;b++)
			{
			if (p[a][b] == 0)
			{
				m = m + 1;
			}
			if (p[a][b] != p[a][b + 1])
			{
				l = l + 1;
			}
			}
			h = (l - 4) / 3;
			L = (m - 2 * h - 4) / 2;
			}
		}
		S = h * L;
		System.out.printf("%d",S);
	}

}

