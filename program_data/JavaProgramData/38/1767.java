package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int j;
	double[] a = new double[100];
	double sum;
	double s2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	while (k-- != 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	sum = s2 = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Double.parseDouble(tempVar3);
		}
		sum += a[i];
	}
	sum /= n;
	for (i = 0;i < n;i++)
	{
	s2 += (a[i] - sum) * (a[i] - sum);
	}
	s2 /= n;
	System.out.printf("%.5lf\n",Math.sqrt(s2));
	}
	return 0;
	}

}

