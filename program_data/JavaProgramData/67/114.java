package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

	int i;
	int j;
	double[][] c = new double[10000][2];
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 2;j++)
		{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c[i][j] = Double.parseDouble(tempVar2);
	}
		}
	}
	double[] a = new double[10000];
	for (i = 0;i < n;i++)
	{
	a[i] = c[i][1] / c[i][0];
	}
	for (i = 1;i < n;i++)
	{
		if (a[i] - a[0] > 0.05)
		{

	System.out.print("better\n");
		}
	 if (a[0] - a[i] > 0.05)
	 {

	System.out.print("worse\n");
	 }
		if ((0.05 > (a[0] - a[i])) && (0.05 > (a[i] - a[0])))
		{

	System.out.print("same\n");
		}
	}

	return 0;
	}

}

