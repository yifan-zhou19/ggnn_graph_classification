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
	int jtl;
	int jyx;
	int qtl;
	int qyx;
	double rate1;
	double rate2;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		jtl = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		jyx = Integer.parseInt(tempVar3);
	}
	rate1 = jyx * 1.0 / jtl;
	for (int i = 1;i < n;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		qtl = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		qyx = Integer.parseInt(tempVar5);
	}
	rate2 = qyx * 1.0 / qtl;
	if (rate2 - rate1 > 0.05)
	{
	System.out.print("better\n");
	}
	else if (rate1 - rate2 > 0.05)
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

