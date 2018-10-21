package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double x;
	double[] y = new double[100];
	int[] sz1 = new int[100];
	int[] sz2 = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		if (i == 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz1[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sz2[0] = Integer.parseInt(tempVar3);
		}
		x = 1.0 * sz2[0] / sz1[0];
		}
		else
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			sz1[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			sz2[i] = Integer.parseInt(tempVar5);
		}
		y[i] = 1.0 * sz2[i] / sz1[i];
		}
	}
	for (i = 1;i < n;i++)
	{
		if (y[i] - x > 0.05)
		{
			System.out.print("better\n");
		}
		else if (x - y[i] > 0.05)
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

