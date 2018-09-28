package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] s = new int[100];
	double x;
	double y;
	double p;
	double q;
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
			s[i] = Integer.parseInt(tempVar2);
		}
	if (s[i] <= 18)
	{
		a += 1;
	}
	if (s[i] <= 35 && s[i] >= 19)
	{
		b += 1;
	}
	if (s[i] <= 60 && s[i] >= 36)
	{
		c += 1;
	}
	if (s[i] >= 61)
	{
		d += 1;
	}
	};
	x = (double)a / n * 100;
	y = (double)b / n * 100;
	p = (double)c / n * 100;
	q = (double)d / n * 100;
	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",x,y,p,q);
	}
}

