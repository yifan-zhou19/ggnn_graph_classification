package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j = 0;
	int r = 0;
	int n;
	int f;
	char[][] a = new char[100][100];
	double[] b = new double[100];
	double[] c = new double[100];
	double[] d = new double[100];
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
		a[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i][0] == 'm')
	{
	c[j] = b[i];
	j++;
	}
	if (a[i][0] == 'f')
	{
	d[r] = b[i];
	r++;
	}
	}
	for (i = j - 1;i > 0;i--)
	{
	for (f = 0;f < i;f++)
	{
	if (c[f] > c[f + 1])
	{
	double tmp;
	tmp = c[f + 1];
					c[f + 1] = c[f];
	c[f] = tmp;
	}
	}
	}
	for (i = r - 1;i > 0;i--)
	{
	for (f = 0;f < i;f++)
	{
	if (d[f] < d[f + 1])
	{
	double p;
	p = d[f];
	d[f] = d[f + 1];
	d[f + 1] = p;
	}
	}
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%.2lf ",c[i]);
	}
	for (i = 0;i < r - 1;i++)
	{
	System.out.printf("%.2lf ",d[i]);
	}
	System.out.printf("%.2lf",d[r - 1]);
	return 0;
	}


}

