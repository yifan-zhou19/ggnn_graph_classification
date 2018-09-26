package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int m;
	double[] sz = new double[1000];
	double a1 = 0;
	double a;
	double s1 = 0;
	double s;
	double s2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (k = 0;k < m;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	a1 = 0;
	s1 = 0;
	s2 = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[i]) = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
		a1 += sz[i];
	}
	a = a1 / n;
	for (i = 0;i < n;i++)
	{
		s1 += (sz[i] - a) * (sz[i] - a);
	}
	s2 = s1 / n;
	s = Math.sqrt(s2);
	System.out.printf("%.5lf\n",s);
	}
	return 0;
	}

}

