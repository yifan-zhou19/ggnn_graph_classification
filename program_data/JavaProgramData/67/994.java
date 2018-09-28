package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double a;
	double b;
	double[] q = new double[1000];
	double[] w = new double[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Double.parseDouble(tempVar3);
	}
	a = b / a;
	for (i = 0;i < n - 1;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			q[i] = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			w[i] = Double.parseDouble(tempVar5);
		}
	q[i] = w[i] / q[i];
	}
	for (i = 0;i < n - 1;i++)
	{
		if (q[i] - a > 0.05)
		{
			System.out.print("better\n");
		}
	else if (a - q[i] > 0.05)
	{
		System.out.print("worse\n");
	}
	else
	{
		System.out.print("same\n");
	}
	}
	return 0;
	}
}

