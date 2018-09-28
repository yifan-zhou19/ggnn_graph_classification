package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	int[] b = new int[100];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	double w;
	double[] y = new double[100];
	w = (double)b[0] / a[0];
	for (i = 1;i < n;i++)
	{
		y[i] = (double) b[i] / a[i];
		if (y[i] - w > 0.05)
		{
			System.out.print("better\n");
		}
		else if (w - y[i] > 0.05)
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

