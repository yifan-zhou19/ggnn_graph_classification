package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int temp1;
		int temp2;
		int i;
		int j;
		int a;
		int b;
		int k;
		int c;
		int d;
		int e;
		int[][] sz = new int[100][100];
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
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		e = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
			{
				temp1 = sz[i][j];
				c = 0;
				for (k = 0; k < m && c == 0; k++)
				{
					if (temp1 < sz[i][k])
					{
						c = 1;
					}
				}
				if (c == 0)
				{
					a = i;
					b = j;
					temp2 = sz[a][b];
					d = 0;
					for (k = 0; k < n && d == 0; k++)
					{
						if (temp2 > sz[k][b])
						{
							d = 1;
						}
					}
					if (d == 0)
					{
						System.out.printf("%d+%d", a, b);
						e = 1;
					}
				}
			}
		}
		if (e == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

