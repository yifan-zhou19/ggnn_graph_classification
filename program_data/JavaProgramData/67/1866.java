package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] j = new int[100];
	double[] a = new double[100];
	double[] b = new double[100];
	double x;
	double[] y = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[0] = Double.parseDouble(tempVar3);
	}
	x = b[0] / a[0];
	for (i = 1;i < n;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[i] = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b[i] = Double.parseDouble(tempVar5);
		}
		y[i] = b[i] / a[i];
		if (x - y[i] > 0.05)
		{
			j[i] = 1;
		}
		else if (y[i] - x > 0.05)
		{
			j[i] = 2;
		}
		else
		{
			j[i] = 0;
		}
	}
	for (i = 1;i < n;i++)
	{
		if (j[i] == 1)
		{
			System.out.print("worse\n");
		}
		if (j[i] == 2)
		{
			System.out.print("better\n");
		}
		if (j[i] == 0)
		{
			System.out.print("same\n");
		}
	}
	return 0;
	}

}

