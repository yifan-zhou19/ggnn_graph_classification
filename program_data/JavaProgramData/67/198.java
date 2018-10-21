package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[10000][2];
	int n;
	int i;
	int col;
	double[] b = new double[10000];
	double x = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (col = 0;col < 2;col++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[i][col]) = Integer.parseInt(tempVar2);
		}
	b[i] = 1.0 * a[i][1] / a[i][0];
		}
	}
	for (i = 1;i < n;i++)
	{
	x = b[i] - b[0];
	if (x > 0.05)
	{
	System.out.print("better\n");
	}
	else if (-x > 0.05)
	{
	System.out.print("worse\n");
	}
	else if (x < 0.05 || -x < 0.05)
	{
	System.out.print("same\n");
	}
	}
	return 0;
	}
}

