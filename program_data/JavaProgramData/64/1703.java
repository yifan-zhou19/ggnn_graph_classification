package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		double[][] a = new double[100][100];
		double[] b = new double[100];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		int q;
		q = 0;
		for (j = 0;j < n - 1;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				a[j][i] = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]) + (z[j] - z[i]) * (z[j] - z[i]));
				b[q] = a[j][i];
				q++;
			}
		}
		double e;
		int k;
		for (k = 1;k <= q; k++)
		{
			for (i = 0;i < q - k; i++)
			{
				if (b[i] > b[i + 1])
				{
						e = b[i + 1];
						b[i + 1] = b[i];
						b[i] = e;
				}
			}
		}
		int c;
		c = 0;
		double[] d = new double[100];
		for (k = 1;k < q;k++)
		{
			if (b[k - 1] != b[k])
			{
				d[c] = b[k - 1];
				c++;
			}
		}
		if (b[q - 1] != b[q - 2])
		{
			d[c] = b[q - 1];
			c++;
		}
		for (k = c - 1;k > 0; k--)
		{
			for (j = 0;j < n - 1;j++)
			{
				for (i = j + 1;i < n;i++)
				{
					if (d[k] == a[j][i])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[j],y[j],z[j],x[i],y[i],z[i],a[j][i]);
					}
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				if (d[0] == a[j][i])
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[j],y[j],z[j],x[i],y[i],z[i],a[j][i]);
				}
			}
		}
		return 0;
	}
}

