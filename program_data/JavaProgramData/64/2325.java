package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] a = new int[50];
		int[] b = new int[50];
		double[] d = new double[50];
		double e;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				a[k] = i;
				b[k] = j;
				d[k] = Math.sqrt(1.0 * (x[i] - x[j]) * (x[i] - x[j]) + 1.0 * (y[i] - y[j]) * (y[i] - y[j]) + 1.0 * (z[i] - z[j]) * (z[i] - z[j]));
				k++;
			}
		}
		for (i = k;i > 0;i--)
		{
			  for (j = k - 1;j > 0;j--)
			  {
				if (d[j] > d[j - 1])
				{
					e = d[j];
					d[j] = d[j - 1];
					d[j - 1] = e;
					m = a[j];
					a[j] = a[j - 1];
					a[j - 1] = m;
					m = b[j];
					b[j] = b[j - 1];
					b[j - 1] = m;
				}
			  }
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],d[i]);
		}
		return 0;
	}
}

