package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	double[] x = new double[100];
	double sum;
	double a;
	double s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}

	for (i = 0;i < k;i++)
	{

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	sum = 0;
	for (j = 0;j < n;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		x[j] = Double.parseDouble(tempVar3);
	}
	sum = sum + x[j];
	}

	a = sum / n;
	s = 0;
	for (j = 0;j < n;j++)
	{
	s = s + (x[j] - a) * (x[j] - a);
	}
	s = Math.sqrt(s / n);
	System.out.printf("%.5f\n",s);
	}
	return 0;
	}


}

