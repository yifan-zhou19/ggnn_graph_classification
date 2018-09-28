package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	double a;
	double b;
	double c;
	double d;
	b = 0;
	c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[MAX];
	int[] xf = new int[MAX];
	for (int m = 0;m < n;m++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		xf[m] = Integer.parseInt(tempVar2);
	}
	c = c + xf[m];
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	if (sz[i] < 60)
	{
		a = 0;
	}
	if (sz[i] >= 60 && sz[i] <= 63)
	{
		a = 1.0;
	}
	if (sz[i] >= 64 && sz[i] <= 67)
	{
		a = 1.5;
	}
	if (sz[i] >= 68 && sz[i] <= 71)
	{
		a = 2.0;
	}
	if (sz[i] >= 72 && sz[i] <= 74)
	{
		a = 2.3;
	}
	if (sz[i] >= 75 && sz[i] <= 77)
	{
		a = 2.7;
	}
	if (sz[i] >= 78 && sz[i] <= 81)
	{
		a = 3.0;
	}
	if (sz[i] >= 82 && sz[i] <= 84)
	{
		a = 3.3;
	}
	if (sz[i] >= 85 && sz[i] <= 89)
	{
		a = 3.7;
	}
	if (sz[i] >= 90 && sz[i] <= 100)
	{
		a = 4.0;
	}
	b = b + a * xf[i];
	}
	d = b / c;
	System.out.printf("%.2lf",d);
	return 0;
	}
}

