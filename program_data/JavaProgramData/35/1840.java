package <missing>;

public class GlobalMembers
{
	public static int min(int n, int p, int q, int[][] f, int w)
	{
		int m;
		for (m = 0;m < n;m++)
		{
			if (f[p][q] > f[m][q])
			{
				break;
			}
			if (m == n - 1)
			{
				w++;
				System.out.printf("%d+%d",p,q);
			}
		}
		return w;
	}


	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int p;
		int q;
		int[][] f = new int[8][8];
		int w = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			k = f[i][0];
			p = i;
			q = 0;
			for (j = 0;j < m;j++)
			{
				if (f[i][j] > k)
				{
					k = f[i][j];
					q = j;
				}
			}
			w = w + min(n, p, q, f, w);
		}
		if (w == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

