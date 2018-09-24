package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String sex = new String(new char[8]);
	int n;
	int i;
	int m1;
	int m2;
	int j;
	double[] a = new double[41];
	double[] b = new double[41];
	double t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m1 = 0;
	m2 = 0;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sex = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		t = Double.parseDouble(tempVar3);
	}
	if (sex.charAt(0) == 'm')
	{
		m1 = m1 + 1;
		a[m1] = t;
	}
	if (sex.charAt(0) == 'f')
	{
		m2 = m2 + 1;
		b[m2] = t;
	}
	}
	for (i = 1;i <= m1;i++)
	{
	for (j = 1;j <= m1 - i;j++)
	{
	if (a[j] > a[j + 1])
	{
	t = a[j];
	a[j] = a[j + 1];
	a[j + 1] = t;
	}
	}
	}
	for (i = 1;i <= m1;i++)
	{
		System.out.printf("%.2lf ",a[i]);
	}
	for (i = 1;i <= m2;i++)
	{
	for (j = 1;j <= m2 - i;j++)
	{
	if (b[j] > b[j + 1])
	{
	t = b[j];
	b[j] = b[j + 1];
	b[j + 1] = t;
	}
	}
	}
	for (i = m2;i >= 2;i--)
	{
		System.out.printf("%.2lf ",b[i]);
	}
	System.out.printf("%.2lf",b[1]);
	return 0;
	}

}

