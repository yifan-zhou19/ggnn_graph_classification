package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[500];
	int[] b = new int[500];
	double[] c = new double[500];
	double GPA;
	int i;
	int kc;
	int j;
	double sum;
	double res;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		kc = Integer.parseInt(tempVar);
	}
	for (i = 0;i < kc;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < kc;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0,j = 0;i < kc,j < kc;i++,j++)
	{
	if (b[i] >= 90 && b[i] <= 100)
	{
	c[j] = 4.0;
	}
	else if (b[i] >= 85 && b[i] <= 89)
	{
	c[j] = 3.7;
	}
	else if (b[i] >= 82 && b[i] <= 84)
	{
	c[j] = 3.3;
	}
	else if (b[i] >= 78 && b[i] <= 81)
	{
	c[j] = 3.0;
	}
	else if (b[i] >= 75 && b[i] <= 77)
	{
	c[j] = 2.7;
	}
	else if (b[i] >= 72 && b[i] <= 74)
	{
	c[j] = 2.3;
	}
	else if (b[i] >= 68 && b[i] <= 71)
	{
	c[j] = 2.0;
	}
	else if (b[i] >= 64 && b[i] <= 67)
	{
	c[j] = 1.5;
	}
	else if (b[i] >= 60 && b[i] <= 63)
	{
	c[j] = 1.0;
	}
	else if (b[i] < 60)
	{
	c[j] = 0.0;
	}
	}
	sum = 0;
	res = 0;
	for (i = 0;i < kc;i++)
	{
	sum = sum + 1.00 * c[i] * a[i];
	res = res + a[i];
	}
	GPA = 1.00 * sum / res;
	System.out.printf("%.2lf",GPA);
	return 0;
	}
}

