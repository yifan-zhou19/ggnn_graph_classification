package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int x;
	int a;
	int b;
	int c;
	int d;
	k = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double A;
	double B;
	double C;
	double D;
	a = 0;
	b = 0,c = 0;
	d = 0;
	while (k <= n)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	if (x <= 18)
	{
	a = a + 1;
	}
	else if (x <= 35)
	{
	b = b + 1;
	}
	else if (x <= 60)
	{
	c = c + 1;
	}
	else
	{
	d = d + 1;
	}
	k++;
	}
	A = 100.0 * a / n;
	B = 100.0 * b / n;
	C = 100.0 * c / n;
	D = 100.0 * d / n;
	System.out.printf("1-18: %.2lf%%\n",A);
	System.out.printf("19-35: %.2lf%%\n",B);
	System.out.printf("36-60: %.2lf%%\n",C);
	System.out.printf("60??: %.2lf%%\n",D);
	return 0;
	}
}

