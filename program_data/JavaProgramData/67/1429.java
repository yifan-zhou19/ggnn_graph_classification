package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	double[][] sz = new double[100][2];
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
		sz[i][j] = Double.parseDouble(tempVar2);
	}
		}
	}
	for (i = 1;i < n;i++)
	{
		if ((sz[0][1] / sz[0][0]) - (sz[i][1] / sz[i][0]) > 0.05)
		{
	System.out.print("worse\n");
		}
		else if ((sz[i][1] / sz[i][0]) - (sz[0][1] / sz[0][0]) > 0.05)
		{
	System.out.print("better\n");
		}
		else
		{
			System.out.print("same\n");
		}

	}
	return 0;
	}
}

