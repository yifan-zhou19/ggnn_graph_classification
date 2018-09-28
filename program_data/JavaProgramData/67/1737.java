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
	double[] sz = new double[256];
	double[] sz2 = new double[256];
	double[] youxiao = new double[256];
	for (i = 0;i < n;i += 1)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i]) = Double.parseDouble(tempVar2);
		}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz2[i]) = Double.parseDouble(tempVar3);
	}
	youxiao[i] = sz2[i] / sz[i];
	}
	for (i = 1;i < n;i += 1)
	{
		if (youxiao[i] - youxiao[0] > 0.05)
		{
			System.out.print("better\n");
		}
	else if (youxiao[0] - youxiao[i] > 0.05)
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

