package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int w;
	int m;
	int n;
	int k;
	double[] a = new double[40];
	double[] b = new double[40];
	double[] c = new double[40];
	char[][] q = new char[40][7];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	m = 0;
	n = 0;
	for (i = 0;i < w;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		q[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i] = Double.parseDouble(tempVar3);
	}
	if (q[i][0] == 'f')
	{
	b[m] = a[i];
	m++;
	}
	else
	{
	c[n] = a[i];
	n++;
	}
	}
	double e;
	for (k = 1;k <= m;k++)
	{
	for (i = 0;i < m - k;i++)
	{
	 if (b[i] < b[i + 1])
	 {
		e = b[i + 1];
		b[i + 1] = b[i];
		b[i] = e;
	 }
	}
	}
	for (k = 1;k <= n;k++)
	{
	 for (i = 0;i < n - k;i++)
	 {
		if (c[i] > c[i + 1])
		{
		 e = c[i + 1];
		 c[i + 1] = c[i];
		 c[i] = e;
		}
	 }
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%.2lf ",c[i]);
	}
	for (i = 0;i < m;i++)
	{
	  if (i < m - 1)
	  {
	  System.out.printf("%.2lf ",b[i]);
	  }
	  else
	  {
	  System.out.printf("%.2lf",b[i]);
	  }
	}
	return 0;
	}

}

