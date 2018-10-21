package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m = 0;
		int t;
		double[] a = new double[41];
		double[] b = new double[41];
		double[] h = new double[41];
		double x;
		double y;
		String s = new String(new char[41]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
	//printf("%lf",a[i]);
			if (strcmp(s,"male") == 0)
			{
				a[k + 1] = h[i];
				k = k + 1;
			}
		if (strcmp(s,"female") == 0)
		{
				b[m + 1] = h[i];
				m = m + 1;
		}
		}
		for (j = 1;j <= k;j++)
		{
			for (t = 1;t <= k - j;t++)
			{
				if (a[t] > a[t + 1])
				{
					x = a[t + 1];
					a[t + 1] = a[t];
					a[t] = x;
				}
			}
		}
	for (j = 1;j <= m;j++)
	{
			for (t = 1;t <= m - j;t++)
			{
				if (b[t] < b[t + 1])
				{
					y = b[t + 1];
					b[t + 1] = b[t];
					b[t] = y;
				}
			}
	}
	for (i = 1;i <= k;i++)
	{
	System.out.printf("%.2lf ",a[i]);

	}
	for (i = 1;i < m;i++)
	{
	System.out.printf("%.2lf ",b[i]);
	}
	System.out.printf("%.2lf",b[m]);

	return 0;
	}
}

