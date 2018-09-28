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
		double[] d = new double[4500];
		int i;
		int j;
		int t;
		int p = 0;
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
		int k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (d[i] < d[j])
				{
					double tmp;
					tmp = d[i];
					d[i] = d[j];
					d[j] = tmp;
				}
			}
		}
		double[] a = new double[4500];
		for (i = 0;d[i] != 0;i++)
		{
			if (d[i] == d[i + 1])
			{
				continue;
			}
			else if (d[i] != d[i + 1])
			{
				a[p] = d[i];
				p++;
			}
		}
		for (i = 0;i < p;i++)
		{
			if (a[i] == 0)
			{
				break;
			}
			for (j = 0;j < n;j++)
			{
				for (t = j + 1;t < n;t++)
				{
					if (Math.sqrt((x[t] - x[j]) * (x[t] - x[j]) + (y[t] - y[j]) * (y[t] - y[j]) + (z[t] - z[j]) * (z[t] - z[j])) == a[i])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[j],y[j],z[j],x[t],y[t],z[t],a[i]);
					}
				}
			}
		}
		return 0;
	}

}

