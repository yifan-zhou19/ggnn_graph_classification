package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[50000];
	int[] b = new int[50000];
	int[] c = new int[50000];
	int[] d = new int[50000];
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	c[i] = a[i];
	}
	int k;
	int m;
	int l;
	for (k = 0;k < n - 1;k++)
	{
		for (m = k + 1;m < n;m++)
		{
			if (c[k] <= c[m])
			{
				c[k] = c[k];
			}
			else
			{
				l = c[m];
				c[m] = c[k];
				c[k] = l;
			}
		}
	}
	int q;
	int w;
	for (q = 0;q < n;q++)
	{
		for (w = 0;w < n;w++)
		{
			if (a[w] == c[q])
			{
				d[q] = b[w];
				break;
			}
			else
			{
				continue;
			}
		}
	}
	int r;
	for (r = 1;r < n;r++)
	{
	if (b[0] < b[r])
	{
		b[0] = b[r];
	}
	}
	int t;
	int y;
	int u = 0;
	for (t = 1;t < n;t++)
	{
		for (y = 0;y <= t;y++)
		{
		if (c[t] <= d[y])
		{
			u += 1;
		}
		else
		{
			u = u;
		}
		}
		if (u > 1)
		{
			u = 0;
		}
		else
		{
			System.out.print("no");
			return 0;
		}
	}
	System.out.printf("%d %d",c[0],b[0]);
	return 0;
	}
}

