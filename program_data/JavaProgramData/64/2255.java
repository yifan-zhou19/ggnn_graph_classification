package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int j = 1;
		int k;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		double[] a = new double[45];
		double m;
		int[] b = new int[45];
		int[] c = new int[45];
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
			(x[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(y[i]) = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			(z[i]) = Integer.parseInt(tempVar4);
		}
		}
		for (i = 1;i <= n - 1;i++)
		{
		   for (k = i + 1;k <= n;k++)
		   {
		a[j] = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k]));
		b[j] = i;
		c[j] = k;
		j++;
		   }
		}
		j = j - 1;
		for (k = 1;k <= j - 1;k++)
		{
		for (i = 1;i <= j - k;i++)
		{
		if (a[i] < a[i + 1])
		{
		m = a[i];
		a[i] = a[i + 1];
		a[i + 1] = m;
		e = b[i];
		b[i] = b[i + 1];
		b[i + 1] = e;
		e = c[i];
		c[i] = c[i + 1];
		c[i + 1] = e;
		}
		}
		}
		for (k = 1;k <= j;k++)
		{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[b[k]],y[b[k]],z[b[k]],x[c[k]],y[c[k]],z[c[k]],a[k]);
		}
		return 0;
	}

}

