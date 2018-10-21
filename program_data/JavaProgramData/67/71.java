package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int k;
	int[] sz = new int[1000];
	int[] sf = new int[1000];
	int n;
	double[] sc = new double[1000];
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
			(sz[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(sf[i]) = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		sc[i] = sf[i] * 1.0 / sz[i];
	}
	for (i = 1;i < n;i++)
	{
		if (sc[i] - sc[0] > 0.05)
		{
			System.out.print("better\n");
		}
		else if (sc[0] - sc[i] > 0.05)
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

