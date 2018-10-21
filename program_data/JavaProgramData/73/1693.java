package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int[] b = new int[5];
	int[] c = new int[5];
	int q;
	int w;
	for (q = 0;q < 5;q++)
	{
		for (w = 0;w < 5;w++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[q][w] = Integer.parseInt(tempVar);
		}
		}
		b[q] = a[q][0];
	}
	int e;
	int r;
	for (e = 0;e < 5;e++)
	{
		for (r = 0;r < 5;r++)
		{
			if (b[e] <= a[e][r])
			{
				b[e] = a[e][r];
			}
			else
			{
				b[e] = b[e];
			}
		}
	}
	int t;
	int y;
	int i = 0;
	for (t = 0;t < 5;t++)
	{
		for (y = 0;y < 5;y++)
		{
			if (a[t][y] == b[t])
			{
				c[t] = y;
				break;
			}
		}
	}
	int u;
	int p;
	int s = 0;
	for (u = 0;u < 5;u++)
	{
		for (p = 0;p < 5;p++)
		{
			if (b[u] < a[p][c[u]])
			{
				s += 1;
			}
			else
			{
				s += 0;
			}
		}
		if (s == 4)
		{
			System.out.printf("%d %d %d",u + 1,c[u] + 1,b[u]);
			i += 1;
		}
		else
		{
			i = i;
		}
		s = 0;
	}
	if (i == 0)
	{
		System.out.print("not found");
	}
	return 0;
	}
}

