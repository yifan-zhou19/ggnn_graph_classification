package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] x = new int[100];
	int[] y = new int[100];
	int[] z = new int[100];
	int k;
	int t;
	double[] s = new double[1000];
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
	t = 0;
	for (k = 0;k < n;k++)
	{
		for (i = k + 1;i < n;i++)
		{
		s[t] = Math.sqrt(1.0 * ((x[k] - x[i]) * (x[k] - x[i]) + (y[k] - y[i]) * (y[k] - y[i]) + (z[k] - z[i]) * (z[k] - z[i])));
		t++;
		}
	}
	for (i = 1;i <= n * (n - 1) / 2;i++)
	{
	for (t = 0;t < n * (n - 1) / 2 - i;t++)
	{
		if (s[t] < s[t + 1])
		{
		e = s[t];
		s[t] = s[t + 1];
		s[t + 1] = e;
		}
	}
	}
	for (t = 0;t < n * (n - 1) / 2;t++)
	{
		if (s[t] == s[t + 1])
		{
		continue;
		}
		else
		{
			for (k = 0;k < n;k++)
			{
				for (i = k + 1;i < n;i++)
				{
				if (s[t] == Math.sqrt(1.0 * ((x[k] - x[i]) * (x[k] - x[i]) + (y[k] - y[i]) * (y[k] - y[i]) + (z[k] - z[i]) * (z[k] - z[i]))))
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[k],y[k],z[k],x[i],y[i],z[i],s[t]);
				}

				}
			}
		}
	}
	return 0;
	}


}

