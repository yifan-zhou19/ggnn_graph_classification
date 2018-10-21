package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int y;
		int[] a = new int[50005];
		int[] b = new int[50005];
		int[] c = new int[50005];
		int[] d = new int[50005];
		double x;
		int f;
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			c[i] = a[i];
			d[i] = b[i];
		}
		for (i = 1;i < n;i++)
		{
			for (k = 1;k <= n - i;k++)
			{
				if (c[k + 1] < c[k])
				{
					m = c[k];
					c[k] = c[k + 1];
					c[k + 1] = m;
				}
				if (d[k + 1] < d[k])
				{
					y = d[k];
					d[k] = d[k + 1];
					d[k + 1] = y;
				}
			}
		}
		for (x = c[1];x <= d[n];x += 0.5)
		{
			f = 0;
			for (i = 1;i <= n;i++)
			{
				if (x >= a[i] != 0 && x <= b[i])
				{
					f++;
				}
			}
			if (f != 0)
			{
				g++;
			}
		}
		if (g == (d[n] - c[1]) * 2 + 1)
		{
			System.out.printf("%d %d",c[1],d[n]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

