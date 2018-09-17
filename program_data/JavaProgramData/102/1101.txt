package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int l;
	j = k = 0;
	String zfc = new String(new char[7]);
	double h;
	double e;
	double[] b = new double[39];
	double[] g = new double[39];
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
			zfc = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			h = Double.parseDouble(tempVar3);
		}
		if (zfc.charAt(0) == 'm')
		{
			  b[j] = h;
			  j++;
		}
		else
		{
			g[k] = h;
			k++;
		}
	}
	for (i = 1;i <= j;i++)
	{
		for (l = 0;l < j - i;l++)
		{
			if (b[l] > b[l + 1])
			{
				e = b[l];
				b[l] = b[l + 1];
				b[l + 1] = e;
			}
		}
	}
	for (i = 1;i <= k;i++)
	{
		for (l = 0;l < k - i;l++)
		{
			if (g[l] < g[l + 1])
			{
				e = g[l];
				g[l] = g[l + 1];
				g[l + 1] = e;
			}
		}
	}
	for (i = 0;i < j;i++)
	{
		System.out.printf("%.2lf ",b[i]);
	}
	for (i = 0;i < k - 1;i++)
	{
		System.out.printf("%.2lf ",g[i]);
	}
	System.out.printf("%.2lf",g[k - 1]);
		return 0;
	}
}

