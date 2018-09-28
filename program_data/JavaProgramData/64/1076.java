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
		int j;
		int k;
		int m;
		int h = 0;
		double[][] d = new double[ROW][COL];
		double[] e = new double[100];
		double w;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
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
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					c[i] = Integer.parseInt(tempVar4);
				}
			}
			else
			{
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					a[i] = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					b[i] = Integer.parseInt(tempVar6);
				}
				String tempVar7 = ConsoleInput.scanfRead(" ");
				if (tempVar7 != null)
				{
					c[i] = Integer.parseInt(tempVar7);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				w = 1.0 * ((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
					d[i][j] = Math.pow(w,1.0 / 2);
					e[h] = d[i][j];
					h++;
			}
		}
		m = n * (n - 1) / 2;
		for (k = 1;k <= m;k++)
		{
			for (i = 0;i < m - k;i++)
			{
				if (e[i] > e[i + 1])
				{
					f = e[i + 1];
					e[i + 1] = e[i];
					e[i] = f;
				}
			}
		}
		e[m] = 0;
		for (k = m - 1;k >= 0;k--)
		{
			if (!(e[k] == e[k + 1]))
			{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (d[i][j] == e[k])
					{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i],b[i],c[i],a[j],b[j],c[j],e[k]);
					}
				}
			}
			}
		}
		return 0;
	}
}

