package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] x = new int[10000];
	int[] y = new int[10000];
	int all = 0;
	double GPA;
	double[] a = new double[10000];
	double t = 0;
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
			(x[i]) = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(y[i]) = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
		if (90 <= y[i])
		{
			a[i] = 4.0;
		}
		else if (85 <= y[i] != 0 && y[i] < 90)
		{
			a[i] = 3.7;
		}
		else if (82 <= y[i] != 0 && y[i] < 85)
		{
			a[i] = 3.3;
		}
		else if (78 <= y[i] != 0 && y[i] < 82)
		{
			a[i] = 3.0;
		}
		else if (75 <= y[i] != 0 && y[i] < 78)
		{
			a[i] = 2.7;
		}
		else if (72 <= y[i] != 0 && y[i] < 75)
		{
			a[i] = 2.3;
		}
		else if (68 <= y[i] != 0 && y[i] < 72)
		{
			a[i] = 2.0;
		}
		else if (64 <= y[i] != 0 && y[i] < 68)
		{
			a[i] = 1.5;
		}
		else if (60 <= y[i] != 0 && y[i] < 64)
		{
			a[i] = 1.0;
		}
		else
		{
			a[i] = 0;
		}
	}
	for (i = 0;i < n;i++)
	{
		all += x[i];
	}
	for (i = 0;i < n;i++)
	{
		t += x[i] * a[i];
	}
	GPA = t / all;
	System.out.printf("%.2lf\n ",GPA);
	return 0;
	}
}

