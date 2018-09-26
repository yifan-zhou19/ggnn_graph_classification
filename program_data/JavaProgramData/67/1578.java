package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double[] a = new double[100];
	double[] c = new double[100];
	double[] d = new double[100];
	double h;
	int n;
	int i;
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
		a[i] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c[i] = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	d[i] = c[i] / a[i];
	}
	for (i = 1;i < n;i++)
	{
	h = d[i] - d[0];
	if (h > 0.05)
	{
		System.out.print("better\n");
	}
	else if (h < -0.05)
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

