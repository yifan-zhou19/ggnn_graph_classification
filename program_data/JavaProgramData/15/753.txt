package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[1000][1000];
	int n;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;
	int h;
	int m;
	int i;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	   for (t = 0;t < n;t++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i][t] = Integer.parseInt(tempVar2);
		}
	   }
	}
	for (a = 0;a < n;a++)
	{
	for (b = 0;b < n;b++)
	{
		if (sz[a][b] == 0)
		{
			d = b;
			break;
		}
	}
	}
	for (a = 0;a < n;a++)
	{
	for (b = n - 1;b >= 0;b--)
	{
		if (sz[a][b] == 0)
		{
			c = b;
			break;
		}
	}
	}
	for (e = n - 1;e >= 0;e--)
	{
	for (f = n - 1;f >= 0;f--)
	{
		if (sz[e][f] == 0)
		{
			g = e;
			break;
		}
	}
	}
	for (e = 0;e < n;e++)
	{
	for (f = n - 1;f >= 0;f--)
	{
		if (sz[e][f] == 0)
		{
			h = e;
			break;
		}
	}
	}

	m = (h - g - 1) * (c - d - 1);
	System.out.printf("%d",m);
	return 0;
	}
}

