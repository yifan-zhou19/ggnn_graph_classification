package <missing>;

public class GlobalMembers
{
	public static double cao(int n)
	{
	int i;
	double tmp;
	double tt = 1;
	double ttt = 2;
	double s = 0;
	double ss = 0;
	for (i = 1;i <= n;i++)
	{
		ss = ttt / tt;
		tmp = tt;
		tt = ttt,ttt = ttt + tmp;
	s = s + ss;
	}
	return s;
	}
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[99];
	double ccc;
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
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
		ccc = cao(a[i]);
	System.out.printf("%.3lf\n",ccc);
	}
	return 0;
	}
}

