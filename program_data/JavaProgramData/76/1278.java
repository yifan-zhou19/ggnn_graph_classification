package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int n;
		int q;
		int a;
		int p;
	double k;
		int[][] m = new int[50000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		q = m[0][0];
	p = m[0][1];
		for (i = 0;i < n;i++)
		{
			if (m[i][0] < q)
			{
				q = m[i][0];
			}
			if (m[i][1] > p)
			{
				p = m[i][1];
			}
		}
		a = 0;
		for (k = q + 0.5;k < p;k++)
		{
			for (j = 0;j <= n;j++)
			{
				if (k >= m[j][0] != 0 && k <= m[j][1])
				{
					break;
				}
				else
				{
					if (j == n)
					{
						a = 1;
					}
				}
			}
		}
		if (a == 0)
		{
			System.out.printf("%d %d",q,p);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

