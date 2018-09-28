package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int i;
		double[][] d = new double[10][10];
		double[] e = new double[45];
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		int k;
		int t = 0;
		for (i = 0;i < n;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				d[i][k] = Math.sqrt((a[i] - a[k]) * (a[i] - a[k]) + (b[i] - b[k]) * (b[i] - b[k]) + (c[i] - c[k]) * (c[i] - c[k]));
				e[t] = d[i][k];
				t++;
			}
		}
		for (t = 0;t < n * (n - 1) / 2 - 1;t++)
		{
			for (i = n * (n - 1) / 2 - 1;i > t;i--)
			{
				if (e[i] > e[i - 1])
				{
					double m;
					m = e[i];
					e[i] = e[i - 1];
					e[i - 1] = m;
				}
			}
		}
		for (t = 0;t < n * (n - 1) / 2;t++)
		{
			for (i = 0;i < n;i++)
			{
				for (k = i + 1;k < n;k++)
				{
					if (d[i][k] == e[t])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i],b[i],c[i],a[k],b[k],c[k],e[t]);
						d[i][k] = 0;
						k = n;
						i = n;
					}
				}
			}
		}
		return 0;
	}
}

