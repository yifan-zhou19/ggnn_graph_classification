package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int f;
		int m;
		int x = 0;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[50000];
		int[] d = new int[50000];
		double g;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 0;i < n;i++)
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
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (c[i] > c[i + 1])
				{
					e = c[i + 1];
					c[i + 1] = c[i];
					c[i] = e;
				}
				if (d[i] > d[i + 1])
				{
					f = d[i + 1];
					d[i + 1] = d[i];
					d[i] = f;
				}
			}
		}
		for (g = c[0];g <= d[n - 1];g = g + 1.0 / 2)
		{
			m = 0;
			for (i = 0;i < n;i++)
			{
				if (g >= a[i] != 0 && g <= b[i])
				{
					m++;
				}
			}
			if (m != 0)
			{
				x++;
			}
		}
		if (x != 2 * (d[n - 1] - c[0]) + 1)
		{
				System.out.print("no");
		}
		else
		{
				System.out.printf("%d %d",c[0],d[n - 1]);
		}
		return 0;
	}

}

