package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int f;
	int j;
	double e;
	k = 0;
	f = 0;
	double z;
	double[] a = new double[40];
	double[] b = new double[40];
	String c = new String(new char[10]);
	for (i = 0;i < 40;i++)
	{
	a[i] = 0;
	b[i] = 0;
	}
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
		c = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		z = Double.parseDouble(tempVar3);
	}
	if (c.charAt(0) == 'm')
	{
	a[k] = z;
	k = k + 1;
	}
	else
	{
	b[f] = z;
	f = f + 1;
	}
	}
	for (n = k - 1;n >= 1;n--)
	{
	for (i = 0;i < n;i++)
	{
	if (a[i] > a[i + 1])
	{
	e = a[i];
	a[i] = a[i + 1];
	a[i + 1] = e;
	}
	}
	}
	for (n = f - 1;n >= 1;n--)
	{
	for (i = 0;i < n;i++)
	{
	if (b[i] < b[i + 1])
	{
	e = b[i];
	b[i] = b[i + 1];
	b[i + 1] = e;
	}
	}
	}
	System.out.printf("%.2lf",a[0]);
	if (k > 1)
	{
	for (i = 1;i <= k - 1;i++)
	{
	System.out.printf(" %.2lf",a[i]);
	}
	}
	for (i = 0;i <= f - 1;i++)
	{
	System.out.printf(" %.2lf",b[i]);
	}
	return 0;
	}


}

