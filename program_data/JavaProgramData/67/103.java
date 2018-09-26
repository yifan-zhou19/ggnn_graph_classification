package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double x;
	double[] y = new double[100];
	int[] total = new int[100];
	int[] youxiao = new int[100];
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
			total[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			youxiao[i] = Integer.parseInt(tempVar3);
		}
	}
	x = 1.0 * youxiao[0] / total[0];
	for (i = 1;i < n;i++)
	{
		y[i - 1] = 1.0 * youxiao[i] / total[i];
	}
	for (i = 0;i < n - 1;i++)
	{

	if ((y[i] - x) > 0.05)
	{
		System.out.print("better\n");
	}
	if ((x - y[i]) > 0.05)
	{
		System.out.print("worse\n");
	}
	if ((x - y[i]) <= 0.05 && (y[i] - x) <= 0.05)
	{
		System.out.print("same\n");
	}
	}

		return 0;
	}

}

