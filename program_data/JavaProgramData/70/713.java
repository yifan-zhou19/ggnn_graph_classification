package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	double[][] a = new double[100][2];
	double z;
	double max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 2;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Double.parseDouble(tempVar2);
			}
		}
	}
	for (i = 0;i < n - 1;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			z = (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]);
		if (z > max)
		{
		max = z;
		}
		}
	}
	System.out.printf("%.4lf",Math.sqrt(max));
	return 0;
	}
}

