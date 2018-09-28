package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int t;
		int q = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] a = new int[50];
		int[] b = new int[50];
		double[] s = new double[50];
		double[] ss = new double[50];
		double j;
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
	for (t = 0;t < n - 1;t++)
	{
		for (i = t + 1;i < n;i++)
		{
			s[q] = 1.0 * (x[t] - x[i]) * (x[t] - x[i]) + 1.0 * (y[t] - y[i]) * (y[t] - y[i]) + 1.0 * (z[t] - z[i]) * (z[t] - z[i]);
			ss[q] = Math.sqrt(s[q]);
			a[q] = t;
			b[q] = i;
			q++;
		}
	}
	for (k = 1;k <= q;k++)
	{
		for (i = 0;i < q - k;i++)
		{
			  if (ss[i] < ss[i + 1])
			  {
						j = ss[i + 1];
						ss[i + 1] = ss[i];
						ss[i] = j;
					 j = a[i + 1];
						a[i + 1] = a[i];
						a[i] = j;
					 j = b[i + 1];
						b[i + 1] = b[i];
						b[i] = j;
			  }
		}
	}
	for (i = 0;i < q;i++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],ss[i]);
	}
		return 0;
	}




}

