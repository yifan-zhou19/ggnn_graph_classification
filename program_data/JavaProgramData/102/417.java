package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j = 0;
	int k = 0;
	int p;
	int q;
	String str = new String(new char[10]);
	double[] a = new double[40];
	double[] b = new double[40];
	double[] c = new double[40];
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
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Double.parseDouble(tempVar3);
		}
		if (str.charAt(0) == 'm')
		{
			b[j] = a[i];
			j++;
		}
		else
		{
			c[k] = a[i];
			k++;
		}
	}
	p = j;
	q = k;
	for (i = 0;i < p - 1;i++)
	{
		for (j = 0;j < p - 1;j++)
		{
			if (b[j] > b[j + 1])
			{
				e = b[j];
				b[j] = b[j + 1];
				b[j + 1] = e;
			}
		}
	}
	for (i = 0;i < q - 1;i++)
	{
		for (k = 0;k < q - 1;k++)
		{
			if (c[k] < c[k + 1])
			{
				e = c[k];
				c[k] = c[k + 1];
				c[k + 1] = e;
			}
		}
	}
	for (j = 0;j < p;j++)
	{
		System.out.printf("%.2lf ",b[j]);
	}
	for (k = 0;k < q - 1;k++)
	{
		System.out.printf("%.2lf ",c[k]);
	}
	System.out.printf("%.2lf",c[q - 1]);
	return 0;
	}
}

