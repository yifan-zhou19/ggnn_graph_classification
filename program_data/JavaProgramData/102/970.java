package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[7]);
	int i;
	int n;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double[] a = new double[n];
	double[] b = new double[n];
	double m;
	double t;
	for (i = 0;i < n;i++)
	{
	a[i] = 0;
	b[i] = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Double.parseDouble(tempVar3);
	}
	if (s.charAt(0) == 'm')
	{
	a[i] = m;
	}
	else
	{
		b[i] = m;
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	for (j = 0;j < n - 1;j++)
	{
	if (a[j] > a[j + 1])
	{
	t = a[j];
	a[j] = a[j + 1];
	a[j + 1] = t;
	}
	if (b[j] < b[j + 1])
	{
	t = b[j];
	b[j] = b[j + 1];
	b[j + 1] = t;
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] != 0)
	{
	System.out.printf("%.2lf",a[i]);
	t = a[i];
	break;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] > t)
	{
	System.out.printf(" %.2lf",a[i]);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (b[i] > 0)
	{
	System.out.printf(" %.2lf",b[i]);
	}
	}
	return 0;
	}

}

